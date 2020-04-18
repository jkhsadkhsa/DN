package com.zhongruan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/*图片上传*/
@Controller
@RequestMapping("/uploadController")
public class UploadController {
    public final String UPLOAD_PATH="G://upload/";
    @RequestMapping("/upload")
    public ModelAndView Upload(@RequestParam("myPic") MultipartFile myPic) throws IOException {
        UUID uuid = UUID.randomUUID();
        Long rid = uuid.getLeastSignificantBits();
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String date = ft.format(dNow);
        String filename = myPic.getOriginalFilename();
        String suffix = filename.substring(filename.lastIndexOf('.'));
        File file = new File(UPLOAD_PATH+date+rid+suffix);
        myPic.transferTo(file);
        System.out.println(filename);
        ModelAndView mv = new ModelAndView();
        mv.addObject("upload_path",UPLOAD_PATH);
        mv.addObject("fileName",file.getName());
        mv.setViewName("../upload");
        return mv;
    }
}
