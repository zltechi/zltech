package com.lohtech.swarm.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.lohtech.swarm.model.product.mapper.PmsProductCategoryMapper;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.product.dao.PmsProductCategoryDao;
import com.lohtech.swarm.product.dto.PmsProductCategoryParam;
import com.lohtech.swarm.product.dto.PmsProductCategoryWithChildrenItem;
import com.lohtech.swarm.product.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {

    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;

    @Autowired
    private PmsProductCategoryDao productCategoryDao;

    @Override
    public int create(PmsProductCategoryParam param) {
        return 0;
    }

    @Override
    public int update(Long id, PmsProductCategoryParam param) {
        return 0;
    }

    @Override
    public List<PmsProductCategory> getList(Long parantId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(PmsProductCategory.class);
        example.setOrderByClause("id asc");
        example.createCriteria().andEqualTo("parentId", parantId);
        return productCategoryMapper.selectByExample(example);
    }

    @Override
    public int delete(Long id) {
        return productCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return productCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithCategory() {
        return productCategoryDao.listWithChildren();
    }

    /**
     * 根据分类的parentId设置分类的level
     */
    private void setCategoryLevel(PmsProductCategory productCategory) {
        //没有父分类时为一级分类
        if (productCategory.getParentId() == 0) {
            productCategory.setLevel(0);
        } else {
            //有父分类时选择根据父分类level设置
            PmsProductCategory parentCategory = productCategoryMapper.selectByPrimaryKey(productCategory.getParentId());
            if (parentCategory != null) {
                productCategory.setLevel(parentCategory.getLevel() + 1);
            } else {
                productCategory.setLevel(0);
            }
        }
    }
}
