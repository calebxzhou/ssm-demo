package com.ssm.service.impl;

import com.ssm.service.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public void browse() {

        System.out.println("AOP-Browse");
    }

}
