package lyx;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

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
        System.out.println(new Date(format));
    }


}
