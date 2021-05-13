package com.hailin.service.impl;

import com.hailin.dao.SaleRateDao;
import com.hailin.entity.SaleRate;
import com.hailin.service.SaleRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@Name: SaleRateServiceImpl
@Author: zhouhailin
@Date: 2021/5/13
@Time: 7:53 下午
@Description： 
*/
@Service
public class SaleRateServiceImpl implements SaleRateService {

    @Autowired
    private SaleRateDao saleRateDao;

    public List<SaleRate> find() {
        System.out.println("find: "+saleRateDao.find());
        return null;
    }
}
