package com.zhongruan.web;

import com.zhongruan.bean.UserInfor;
import com.zhongruan.service.Impl.UserInforServiceImpl;
import com.zhongruan.service.IUserInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*用户模块*/
@Controller
@RequestMapping(UserInforController.BASE_CONTRPLLER)
public class UserInforController {
//    常量要公共 静态
    public static final String BASE_CONTRPLLER ="userInforController";
    @Autowired
    private IUserInforService IUserInforService = new UserInforServiceImpl();
//    登录
    @RequestMapping("/doLogin")
//    参数名要与页面的name名保持一致
    public ModelAndView doLogin(String username, String password){

        System.out.println(username+".."+password);
        UserInfor userInfor = IUserInforService.doLogin(username);
        ModelAndView mv = new ModelAndView();
        if (userInfor!=null){
            if (userInfor.getPassword().equals(password)){
                System.out.println("登录成功！");
                mv.setViewName("../main");
                mv.addObject("userInfor",userInfor);
                return mv;
            }
            else {
                System.out.println("密码错误！");
                mv.addObject("msg","密码错误");
                mv.setViewName("../index");
                return mv;
            }
        }
        else {
            System.out.println("没有这个用户");
            mv.addObject("msg","没有这个用户");
            mv.setViewName("../index");
            return mv;
        }
    }
}
