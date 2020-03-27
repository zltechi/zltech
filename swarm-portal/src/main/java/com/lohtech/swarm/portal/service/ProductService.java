package com.lohtech.swarm.portal.service;

import com.lohtech.swarm.common.api.CommonPage;
import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;


public interface ProductService {
    /**
     * 分页获取商品分类列表
     * @param id id
     * @return List
     */
    CommonResult<CommonPage<PmsProductCategory>> getProductCategoryList(Long id);

    /**
     * 根据 ID 获取商品分页信息
     * @param id id
     * @return Object
     */
    CommonResult<PmsProductCategory> getProductCategoryById(Long id);
}
