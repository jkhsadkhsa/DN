package com.zhongruan.service;

import com.zhongruan.bean.Fee;

import java.util.List;

/*资费模块*/
public interface IFeeService {

    //    查询所有资费
    List<Fee> findAllFee(Integer page, Integer size);
    //  添加资费
    int addFee(Fee fee);
    //    删除资费
    int delFee(int fid);
    //    修改前查询资费
    Fee findFeeByFid(int fid);
    //    修改资费
    int updFee(Fee fee);
}
