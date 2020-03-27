package com.lohtech.swarm.product.dto;

public class PmsProductResult extends PmsProductParam {

    // 商品所选分类的父id
    private Integer cateParentId;

    private Integer getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Integer cateParentId) {
        this.cateParentId = cateParentId;
    }
}
