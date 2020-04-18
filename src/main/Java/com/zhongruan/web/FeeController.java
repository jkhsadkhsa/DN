package com.zhongruan.web;

import com.github.pagehelper.PageInfo;
import com.zhongruan.bean.Fee;
import com.zhongruan.service.IFeeService;
import com.zhongruan.service.Impl.FeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*资费模块*/
@Controller
@RequestMapping(FeeController.BASE_FEECONTEOLLER)
public class FeeController {
//    常量
    public static final String BASE_FEECONTEOLLER = "feeController" ;
    @Autowired
    private IFeeService feeService = new FeeServiceImpl();

    @RequestMapping("/findAllFee")
//    查询所有资费
    public ModelAndView findAllFee(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "5") Integer size){
        ModelAndView mv = new ModelAndView();
        List<Fee> allFee = feeService.findAllFee(page,size);
        PageInfo pageInfo = new PageInfo(allFee);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("../fee/fee_list");
        return mv;
    }

    @RequestMapping("/addFee")
//    添加资费
    public ModelAndView addFee(Fee fee){
        int flage = feeService.addFee(fee);
        if (flage>0){
            System.out.println("添加成功");
            ModelAndView mv = new ModelAndView("redirect:/"+BASE_FEECONTEOLLER+"/findAllFee.do");
            return mv;
        }
        else {
            System.out.println("添加失败");
            ModelAndView mv = new ModelAndView();
            mv.setViewName("/../fee/fee_add");
            return mv;
        }
    }

    @RequestMapping("/delFee")
//    删除资费
    public ModelAndView delFee(int fid){
        ModelAndView mv = new ModelAndView();
        int flage = feeService.delFee(fid);
        if (flage>0){
            System.out.println("删除成功");
            mv.setViewName("redirect:/"+BASE_FEECONTEOLLER+"/findAllFee.do");
            return mv;
        }
        else {
            System.out.println("删除失败");
            mv.setViewName("/../error");
            return mv;
        }
    }

    @RequestMapping("/findFeeByFid")
//    修改器查询资费
    public ModelAndView findFeeByFid(Integer fid){
        ModelAndView mv = new ModelAndView();
        Fee feeByFid = feeService.findFeeByFid(fid);
        mv.addObject("feeByFid",feeByFid);
        mv.setViewName("../fee/fee_modi");
        return mv;
    }

    @RequestMapping("/updFee")
//    修改资费
    public ModelAndView updFee(Fee fee){
        ModelAndView mv = new ModelAndView();
        int flage = feeService.updFee(fee);
        if (flage>0){
            System.out.println("修改成功");
            mv.setViewName("redirect:/"+BASE_FEECONTEOLLER+"/findAllFee.do");
            return mv;
        }
        else {
            System.out.println("修改失败");
            mv.setViewName("/../error");
            return mv;
        }
    }

}
