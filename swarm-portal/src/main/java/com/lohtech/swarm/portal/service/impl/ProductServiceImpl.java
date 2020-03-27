package com.lohtech.swarm.portal.service.impl;

import com.lohtech.swarm.common.api.CommonPage;
import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.portal.feign.ProductFeignClient;
import com.lohtech.swarm.portal.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductFeignClient productFeignClient;


    @Override
    public CommonResult<CommonPage<PmsProductCategory>> getProductCategoryList(Long id) {
        return productFeignClient.getProductCategoryList(id);
    }

    @Override
    public CommonResult<PmsProductCategory> getProductCategoryById(Long id) {
        return productFeignClient.getProductCategoryById(id);
    }

}
