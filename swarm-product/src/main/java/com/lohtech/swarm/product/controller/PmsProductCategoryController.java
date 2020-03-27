package com.lohtech.swarm.product.controller;

import com.lohtech.swarm.common.api.CommonPage;
import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.product.dto.PmsProductCategoryParam;
import com.lohtech.swarm.product.dto.PmsProductCategoryWithChildrenItem;
import com.lohtech.swarm.product.service.PmsProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "商品分类")
@Controller
@RequestMapping("/api/v1/category")
public class PmsProductCategoryController {

    @Autowired
    private PmsProductCategoryService productCategoryService;

    @ApiOperation("添加商品分类")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CommonResult<Integer> create(@Validated @RequestBody PmsProductCategoryParam param, BindingResult result) {
        int count = productCategoryService.create(param);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除商品分类")
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable("id") Long id) {
        int count = productCategoryService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改商品分类")
    @RequestMapping(value = "/{id}", method = {RequestMethod.PATCH, RequestMethod.PUT})
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable("id") Long id,
                                        @Validated @RequestBody PmsProductCategoryParam param,
                                        BindingResult result) {
        int count = productCategoryService.update(id, param);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据id获取商品分类")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductCategory> getItem(@PathVariable Long id) {
        PmsProductCategory productCategory = productCategoryService.getItem(id);
        return CommonResult.success(productCategory);
    }

    @ApiOperation("分页查询商品分类")
    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> getList(@PathVariable("id") @Valid Long parentId,
                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<PmsProductCategory> productCategoryList = productCategoryService.getList(parentId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(productCategoryList));
    }

    @ApiOperation("查询所有一级分类及子分类")
    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategoryWithChildrenItem>> listWithChildren() {
        List<PmsProductCategoryWithChildrenItem> list = productCategoryService.listWithCategory();
        return CommonResult.success(list);
    }
}
