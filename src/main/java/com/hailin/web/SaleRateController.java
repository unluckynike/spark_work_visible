package com.hailin.web;

import com.hailin.service.SaleRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
@Name: SaleRateController
@Author: zhouhailin
@Date: 2021/5/13
@Time: 7:55 下午
@Description： 
*/

@RequestMapping("/spark")
@Controller
public class SaleRateController {

    @Autowired
    private SaleRateService saleRateService;

    @RequestMapping(value = "/sale",method = RequestMethod.GET)
    public String find(){
        saleRateService.find();
        return "system/welcome";
    }
}
