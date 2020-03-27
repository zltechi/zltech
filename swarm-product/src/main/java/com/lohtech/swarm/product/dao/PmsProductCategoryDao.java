package com.lohtech.swarm.product.dao;


import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.product.dto.PmsProductCategoryWithChildrenItem;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//@Mapper
public interface PmsProductCategoryDao {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
