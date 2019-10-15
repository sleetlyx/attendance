package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.entity.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/upload")
public class UploadController {
    @Value("${PIC_URL}")
    private String picUrl;
    @RequestMapping("/uploadFile")
    public Result uploadFile(MultipartFile file, HttpServletRequest request){
        File targetFile=null;
        if(file != null){

            try {
                // 获得文件名:
                String fileName = file.getOriginalFilename();
                // 获得文件的扩展名:
                String extName = fileName.substring( fileName.lastIndexOf(".")+1 );

//                String reg = "/(.*)\\.(jpg|bmp|gif|ico|pcx|jpeg|tif|png|raw|tga)$/";
                String reg = "(JPEG|jpeg|JPG|jpg|png|ico|bmp)$";
                Pattern pattern = Pattern.compile(reg);
                Matcher matcher = pattern.matcher(extName);
                if(!matcher.find()){
                    return new Result(false,"只能上传格式为JPEG|jpeg|JPG|jpg|png|ico|bmp的文件");
                }


                //文件名称 按时间+字符串命名
                String randid = UUID.randomUUID().toString();
                randid=randid.replaceAll("-","");

                SimpleDateFormat filenameOriginal = new SimpleDateFormat("YYYYMMdd");
                //外加六个随机数  防止同一时间文件名上传出现重复
                int i = new Random().nextInt(20);
                String newFileName = filenameOriginal.format(new Date())+randid.substring(i,i+6)+"."+extName;

                //获得存储的绝对路径
                String upload = request.getSession().getServletContext().getRealPath("upload/news");

                File file1 =new File(upload);
                //将图片存入问价夹
                targetFile = new File(file1, newFileName);
                file.transferTo(targetFile);
                String resUrel = picUrl+"/"+ newFileName;
                return new Result(true,resUrel);
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"上传图片解析事变");
            }
        }else{
            return  new Result(false,"上传文件不能为空");
        }


    }

}
