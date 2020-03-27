package com.lohtech.swarm.model.product.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_product")
public class PmsProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品类型
     */
    @Column(name = "product_category_id")
    private Long productCategoryId;

    /**
     * 商品属性
     */
    @Column(name = "product_attribution_id")
    private Long productAttributionId;

    /**
     * 市场价
     */
    @Column(name = "original_price")
    private BigDecimal originalPrice;

    /**
     * 促销价格
     */
    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;

    private BigDecimal price;

    /**
     * 商品简介
     */
    private String summary;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 商品封面
     */
    @Column(name = "cover_pic")
    private String coverPic;

    /**
     * 画册图片，产品图片限制为5张，以逗号分割
     */
    @Column(name = "album_pics")
    private String albumPics;

    /**
     * 商品描述
     */
    private String description;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品类型
     *
     * @return product_category_id - 商品类型
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 设置商品类型
     *
     * @param productCategoryId 商品类型
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 获取商品属性
     *
     * @return product_attribution_id - 商品属性
     */
    public Long getProductAttributionId() {
        return productAttributionId;
    }

    /**
     * 设置商品属性
     *
     * @param productAttributionId 商品属性
     */
    public void setProductAttributionId(Long productAttributionId) {
        this.productAttributionId = productAttributionId;
    }

    /**
     * 获取市场价
     *
     * @return original_price - 市场价
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置市场价
     *
     * @param originalPrice 市场价
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取促销价格
     *
     * @return promotion_price - 促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置促销价格
     *
     * @param promotionPrice 促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品简介
     *
     * @return summary - 商品简介
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置商品简介
     *
     * @param summary 商品简介
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取商品封面
     *
     * @return cover_pic - 商品封面
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * 设置商品封面
     *
     * @param coverPic 商品封面
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    /**
     * 获取画册图片，产品图片限制为5张，以逗号分割
     *
     * @return album_pics - 画册图片，产品图片限制为5张，以逗号分割
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * 设置画册图片，产品图片限制为5张，以逗号分割
     *
     * @param albumPics 画册图片，产品图片限制为5张，以逗号分割
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    /**
     * 获取商品描述
     *
     * @return description - 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述
     *
     * @param description 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}