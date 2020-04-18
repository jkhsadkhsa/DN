package com.zhongruan.service.Impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Fee;
import com.zhongruan.dao.IFeeDao;
import com.zhongruan.service.IFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*资费模块*/
@Service
public class FeeServiceImpl implements IFeeService {
    @Autowired
    private IFeeDao feeDao;

    @Override
//    查询所有资费
    public List<Fee> findAllFee(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return feeDao.findAllFee();
    }

    @Override
//    增加资费
    public int addFee(Fee fee) {
        return feeDao.addFee(fee);
    }

    @Override
    public int delFee(int fid) {
        return feeDao.delFee(fid);
    }

    @Override
    public Fee findFeeByFid(int fid) {
        return feeDao.findFeeByFid(fid);
    }

    @Override
    public int updFee(Fee fee) {
        return feeDao.updFee(fee);
    }
}
