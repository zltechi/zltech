package com.lohtech.swarm.portal.controller;

import com.lohtech.swarm.common.api.CommonPage;
import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.portal.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Api(tags = "Product", description = "product相关接口")
@Controller
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "分页查询商品分类")
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductCategory>> productCategoryList() {
        return productService.getProductCategoryList(0L);
    }

    @ApiOperation(value = "根据id获取商品分类")
    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductCategory> getItem(@PathVariable("id") Long id) {
        return productService.getProductCategoryById(id);
    }
}
