package com.lohtech.swarm.product.service;

import com.lohtech.swarm.product.dto.PmsProductParam;
import com.lohtech.swarm.product.dto.PmsProductResult;

public interface PmsProductService {
    int create(PmsProductParam productParam);

    /**
     * 根据商品编号获取更新信息
     */
    PmsProductResult getUpdateInfo(Integer id);
}
