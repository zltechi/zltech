package com.lohtech.swarm.product.dao;

import com.lohtech.swarm.product.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;


public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Integer id);
}
