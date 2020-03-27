package com.lohtech.swarm.product.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * 创建和修改商品时使用的参数
 */
@Getter
@Setter
public class PmsProductParam {

    @ApiModelProperty(value = "商品名称", example = "茅台", required = true)
    @NotEmpty(message = "商品名称不能为空")
    private String name;

    @ApiModelProperty(value = "商品类型id", example = "1", required = true)
    @NotEmpty(message = "商品类型id不能为空")
    private Integer productCategoryId;

    @ApiModelProperty(value = "original_price", example = "199.00")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "promotion_price", example = "199.00")
    private BigDecimal promotionPrice;

    @ApiModelProperty(value = "price", example = "199.00", required = true)
    @NotEmpty(message = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "summary", example = "贵州茅台简介")
    private String summary;
    @ApiModelProperty(value = "description", example = "贵州茅台描述")
    private String description;

    @ApiModelProperty(value = "stock", example = "999")
    private Integer stock;

    @ApiModelProperty(value = "cover_pic", example = "https://cdn.czjy.com/product/maotai.png")
    private String coverPic;

    @ApiModelProperty(value = "album_pics", example = "https://cdn.czjy.com/product/album_maotai1.png, https://cdn.czjy.com/product/album_maotai2.png")
    private String albumPics;
}
