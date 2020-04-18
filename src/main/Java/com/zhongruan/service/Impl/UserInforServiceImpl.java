package com.zhongruan.service.Impl;

import com.zhongruan.bean.Role;
import com.zhongruan.bean.UserInfor;
import com.zhongruan.dao.IRoleDao;
import com.zhongruan.dao.IUserInforDao;
import com.zhongruan.service.IUserInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
* 用户模块
* */
@Service("userService")
public class UserInforServiceImpl implements IUserInforService {
    @Autowired
    private IUserInforDao IUserInforDao;
    @Autowired
    private IRoleDao roleDao;
//    登录
    @Override
    public UserInfor doLogin(String username) {
        System.out.println(roleDao.findRoleByUid(1));
        System.out.println(username);
        return IUserInforDao.doLogin(username);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        UserInfor userInfor = IUserInforDao.doLogin(username);
        System.out.println(userInfor);
        System.out.println("1111111111111111111111111111111111111111111111111111111111111");
        List<Role> roleByUid = roleDao.findRoleByUid(userInfor.getUid());
        System.out.println("2222222222222222222222222222222222222222222222222222222222222");
        System.out.println(roleByUid);
        System.out.println("3333333333333333333333333333333333333333333333333333333333333333");
        userInfor.setRoleList(roleByUid);
        System.out.println("44444444444444444444444444444444444444444444444444444444444444444");
        System.out.println(userInfor);
        System.out.println("555555555555555555555555555555555555555555555555555555555555555555");
        /*将登陆信息交给 spring-security 处理*/
        User user = new User(userInfor.getUsername(),"{noop}"+userInfor.getPassword(),Authority(roleByUid));
        System.out.println(user);
        return user;
    }

    private Collection<? extends GrantedAuthority> Authority(List<Role> roleByUid) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roleByUid){
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRname().toUpperCase()));
        }
        return list;
    }

}
