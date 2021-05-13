package com.hailin.service;

import com.hailin.entity.SaleRate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleRateService {
    List<SaleRate> find();
}
