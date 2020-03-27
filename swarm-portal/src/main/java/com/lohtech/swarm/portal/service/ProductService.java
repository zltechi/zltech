package com.lohtech.swarm.portal.service;

import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;

import java.util.List;

public interface ProductService {
    CommonResult<List<PmsProductCategory>> getProductCategoryList(Integer id);
}
