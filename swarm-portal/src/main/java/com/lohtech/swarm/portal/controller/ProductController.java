package com.lohtech.swarm.portal.controller;

import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.portal.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "Product", description = "product相关接口")
@Controller
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "商品分类列表")
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> productCategoryList() {
        return productService.getProductCategoryList(0);
    }

    @ApiOperation(value = "商品详情")
    @RequestMapping(value = "/category/{category_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> specificationById(@Param("category_id") Integer id) {
        return CommonResult.success(id);
    }
}
