package com.lohtech.swarm.product.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.lohtech.swarm.model.product.mapper.PmsProductMapper;
import com.lohtech.swarm.model.product.pojo.PmsProduct;
import com.lohtech.swarm.product.dao.PmsProductDao;
import com.lohtech.swarm.product.dto.PmsProductParam;
import com.lohtech.swarm.product.dto.PmsProductResult;
import com.lohtech.swarm.product.service.PmsProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PmsProductServiceImpl implements PmsProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductServiceImpl.class);

    @Autowired
    private PmsProductMapper productMapper;

    @Autowired
    private PmsProductDao productDao;

    @Override
    public int create(PmsProductParam productParam) {

        PmsProduct product = new PmsProduct();
        BeanUtil.copyProperties(productParam, product);

        //创建商品
        product.setId(null);
        productMapper.insertSelective(product);

        return 1;
    }

    @Override
    public PmsProductResult getUpdateInfo(Integer id) {
        return productDao.getUpdateInfo(id);
    }
}
