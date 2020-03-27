package com.lohtech.swarm.product.dto;

import io.swagger.annotations.ApiModelProperty;


import javax.validation.constraints.NotEmpty;
import java.util.List;

public class PmsProductCategoryParam {
    @ApiModelProperty("父分类的编号")
    private Long parentId;

//    @ApiModelProperty("分类级别")
//    private Long level;

    @ApiModelProperty(value = "商品分类名称",required = true)
    @NotEmpty(message = "商品分类名称不能为空")
    private String name;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("关键字")
    private String keywords;

    @ApiModelProperty("描述")
    private String description;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

//    public Long getLevel() {
//        return level;
//    }
//
//    public void setLevel(Long level) {
//        this.level = level;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
