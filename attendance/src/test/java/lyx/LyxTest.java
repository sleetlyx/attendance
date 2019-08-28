package lyx;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static lyx.MD5Util.MD5Encode;

public class LyxTest {

    @Test
    public void fin(){
        String sign = MD5Encode("undefined", "UTF-8").toUpperCase();
        System.out.println(sign);
    }

    @Test
    public void fin1(){
        UUID uuid = UUID.randomUUID();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMddHHmmss");
        String format = simpleDateFormat.format(new Date());

        int i = new Random().nextInt(20);
//      System.out.println(uuid.toString().replace("-","").substring(i,i+5));
//        System.out.println(new Date(format));
    }
    @Test
    public  void  fun(){
        String reg = "(JPEG|jpeg|JPG|jpg|png)$";
        String imgp= "png";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(imgp);
        System.out.println(pattern.pattern());

    }

    @Test
    public  void  fun2(){
        Map<String, Object> publicNumberOr =  new HashMap<>();
        publicNumberOr.put("total",1532);
        publicNumberOr.put("count",1000);
      Double  total = Double.parseDouble(publicNumberOr.get("total")+"");
      Double count = Double.parseDouble(publicNumberOr.get("count")+"");
      Double ceil = Math.ceil(total / count);
        String s = ceil.toString();
        int i = Integer.parseInt(s.substring(0, s.length() - 2));
        System.out.println(i);
    }

}
