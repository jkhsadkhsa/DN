package com.zhongruan.dao;

import com.zhongruan.bean.Role;

import java.util.List;

/*权限*/
public interface IRoleDao {
//    根据用户uid查询拥有权限
    List<Role> findRoleByUid(int uid);
}
