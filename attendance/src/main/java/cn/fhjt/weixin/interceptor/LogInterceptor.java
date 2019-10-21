package cn.fhjt.weixin.interceptor;

import cn.fhjt.weixin.mapper.TbLogsMapper;
import cn.fhjt.weixin.pojo.TbLogs;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NamedThreadLocal;
import org.springframework.messaging.handler.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @version V1.0
 * @ClassName LogInterceptor
 * @Description 日志拦截器
 * 记录信息: 访问时间-Controller路径-对应方法名-请求参数信息-请求相对路径-请求处理时长
 **/
public class LogInterceptor implements HandlerInterceptor {
    @Autowired
    private TbLogsMapper logsMapper;

    public static final Logger LOGGER = Logger.getLogger(LogInterceptor.class);


    private static final ThreadLocal<Long> startTimeThreadLocal =
            new NamedThreadLocal<Long>("ThreadLocal StartTime");

    private String getParamString(Map<String, String[]> map) {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,String[]> e:map.entrySet()){
            sb.append(e.getKey()).append("=");
            String[] value = e.getValue();
            if(value != null && value.length == 1){
                sb.append(value[0]).append("\t");
            }else{
                sb.append(Arrays.toString(value)).append("\t");
            }
        }
        return sb.toString();
    }

    /**
     * 将ErrorStack转化为String.
     */
    public static String getStackTraceAsString(Throwable e) {
        if (e == null){
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /**
     * 该方法将在请求处理之前进行调用。
     * 多个Interceptor，然后SpringMVC会根据声明的前后顺序一个接一个的执行，而且所有的Interceptor中的preHandle方法都会在
     * Controller方法调用之前调用。SpringMVC的这种Interceptor链式结构也是可以进行中断的，这种中断方式是令preHandle的返
     * 回值为false，当preHandle的返回值为false的时候整个请求就结束了。
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        startTimeThreadLocal.set(startTime);		//线程绑定变量（该数据只有当前请求的线程可见）
//        if (handler instanceof HandlerMethod) {
        if (handler instanceof HttpServletRequest) {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("-----------------------开始计时:").append(new SimpleDateFormat("hh:mm:ss.SSS").format(startTime)).append("-------------------------------------\n");
            HandlerMethod h = (HandlerMethod) handler;
            sb.append("Controller: ").append(h.getBean().getClass().getName()).append("\n");
            sb.append("Method    : ").append(h.getMethod().getName()).append("\n");
            sb.append("Params    : ").append(getParamString(request.getParameterMap())).append("\n");
            sb.append("URI       : ").append(request.getRequestURI()).append("\n");
            LOGGER.debug(sb.toString());
        }

        return true;
    }

    /**
     * 在当前请求进行处理之后，也就是Controller 方法调用之后执行，但是它会在DispatcherServlet 进行视图返回渲染之前被调用，所以我们可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作。
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        if(handler instanceof HandlerMethod){
            StringBuilder sb = new StringBuilder(1000);
            sb.append("CostTime  : ").append(executeTime).append("ms").append("\n");
            sb.append("-------------------------------------------------------------------------------");
            LOGGER.debug(sb.toString());
        }
    }


    /**
     * 该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行。这个方法的主要作用是用于进行资源清理工作的。
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 打印JVM信息。
        if (LOGGER.isDebugEnabled()){
            long beginTime = startTimeThreadLocal.get();//得到线程绑定的局部变量（开始时间）
            long endTime = System.currentTimeMillis(); 	//2、结束时间
            String[] split = request.getRequestURI().toString().split("/");


            String url = split[2]+"/"+split[3];

            HttpSession session = request.getSession();

            Object userNameob = session.getAttribute("userName");
            String userName=null;
            if(userNameob != null){
                userName = userNameob.toString();
            }
            String clientIp = request.getRemoteAddr();
            String tim=new SimpleDateFormat("ss.SSS").format(endTime - beginTime);

            //如果controller报错，则记录异常错误
            if(ex != null){
                CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
//                try {
//
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
                TbLogs tbLogs = new TbLogs();
                if(url.equals("emp/updateEmpState.do") || url.equals("emp/updateEmpDeptId.do")){//此时进行日志记录

                    if(url.equals("emp/updateEmpState.do")){
                        tbLogs.setExecutiveBusiness("修改员工状态为离职未办手续");
                    }
                    if(url.equals("emp/updateEmpDeptId.do")){
                        tbLogs.setExecutiveBusiness("修改员工部门");
                    }
                    tbLogs.setOperator(userName);
                    tbLogs.setcIp(clientIp);

                    tbLogs.setOperationInterface(url);
                    tbLogs.setSuccessFlag("失败");
                    tbLogs.setTimeConsuming(tim);
                    tbLogs.setCreationTime(new Date());
                    logsMapper.insert(tbLogs);
                }

                LOGGER.debug("Controller异常: " + getStackTraceAsString(ex)+tbLogs.toString());

            }else{


                if(url.equals("emp/updateEmpState.do") || url.equals("emp/updateEmpDeptId.do")){//此时进行日志记录

                    TbLogs tbLogs = new TbLogs();

                    if(url.equals("emp/updateEmpState.do")){
                        tbLogs.setExecutiveBusiness("修改员工"+session.getAttribute("modifierState"));
                    }
                    if(url.equals("emp/updateEmpDeptId.do")){
                        session.getAttribute("test");
                        tbLogs.setExecutiveBusiness("修改员工{"+session.getAttribute("modifier")+"}");
                    }
                    tbLogs.setOperator(userName);
                    tbLogs.setOperationInterface(url);
                    tbLogs.setcIp(clientIp);
                    tbLogs.setSuccessFlag("成功");
                    tbLogs.setTimeConsuming(tim);
                    tbLogs.setCreationTime(new Date());
                    CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
                    logsMapper.insert(tbLogs);

                }

            }
            LOGGER.debug(
                    "操作者："+userName+
                            ">>请求的ip："+clientIp+
                            ">>请求方式："+request.getMethod()+
                            ">>开始时间："  +   new SimpleDateFormat("hh:mm:ss.SSS").format(beginTime) +
                            ">>计时结束："+ new SimpleDateFormat("hh:mm:ss.SSS").format(endTime) +
                            " >>耗时：" +tim+
                            ">>URI:" + url+
                            ">> 最大内存: " +Runtime.getRuntime().maxMemory()/1024/1024+
                            "m  >>已分配内存: " +Runtime.getRuntime().totalMemory()/1024/1024+
                            "m >> 已分配内存中的剩余空间: " +Runtime.getRuntime().freeMemory()/1024/1024+
                            "m  >>最大可用内存: " + (Runtime.getRuntime().maxMemory()-Runtime.getRuntime().totalMemory()+Runtime.getRuntime().freeMemory())/1024/1024 + "m");

            startTimeThreadLocal.remove();
        }
    }
}