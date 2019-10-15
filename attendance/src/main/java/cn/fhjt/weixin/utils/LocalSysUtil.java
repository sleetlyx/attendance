package cn.fhjt.weixin.utils;

public class LocalSysUtil {

    /**
     * 向上取整
     * @param max
     * @param min
     * @return 返回取整的值
     */
    public static Integer mathCeil(String max,String min){
        Double Dmax = Double.parseDouble(max);
        Double Dmin = Double.parseDouble(min);
        Double ceil = Math.ceil(Dmax / Dmin);
        String s = ceil.toString();
        int k = Integer.parseInt(s.substring(0, s.length() - 2));
        return k;
    }

}
