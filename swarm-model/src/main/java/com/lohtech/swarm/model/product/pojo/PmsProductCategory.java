package com.lohtech.swarm.model.product.pojo;

import javax.persistence.*;

@Table(name = "pms_product_category")
public class PmsProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 分类级别：0->1级；1->2级
     */
    private Integer level;

    private String name;

    /**
     * 图标
     */
    private String icon;

    private String keywords;

    /**
     * 描述
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
     * 获取上机分类的编号：0表示一级分类
     *
     * @return parent_id - 上机分类的编号：0表示一级分类
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上机分类的编号：0表示一级分类
     *
     * @param parentId 上机分类的编号：0表示一级分类
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取分类级别：0->1级；1->2级
     *
     * @return level - 分类级别：0->1级；1->2级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置分类级别：0->1级；1->2级
     *
     * @param level 分类级别：0->1级；1->2级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}