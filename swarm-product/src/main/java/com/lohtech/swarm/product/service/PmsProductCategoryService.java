package com.lohtech.swarm.product.service;

import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.product.dto.PmsProductCategoryParam;
import com.lohtech.swarm.product.dto.PmsProductCategoryWithChildrenItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PmsProductCategoryService {

    /**
     * 创建商品分类
     * @param param 商品分类信息
     * @return int
     */
    @Transactional
    int create(PmsProductCategoryParam param);

    /**
     * 修改商品分类
     * @param id    id
     * @param param 商品分类信息
     * @return int
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam param);

    /**
     * 分页获取商品分类
     * @param parantId 父节点id
     * @param page     页码
     * @param pageSize 每页记录条数
     * @return List
     */
    List<PmsProductCategory> getList(Long parantId, Integer page, Integer pageSize);

    /**
     * 删除商品分类
     */
    int delete(Long id);

    /**
     * 根据 ID 获取商品分类信息
     * @param id id
     * @return Object
     */
    PmsProductCategory getItem(Long id);

    /**
     * 已层级方式获取商品分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithCategory();
}
