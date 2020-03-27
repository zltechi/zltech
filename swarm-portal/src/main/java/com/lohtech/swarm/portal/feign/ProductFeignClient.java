package com.lohtech.swarm.portal.feign;


import com.lohtech.swarm.common.api.CommonPage;
import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.portal.fallback.ProductFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "swarm-product", fallback = ProductFeignClientFallback.class)
public interface ProductFeignClient {

    @RequestMapping(value = "/api/v1/category/list/{id}", method = RequestMethod.GET, consumes = "applicaton/json")
    CommonResult<CommonPage<PmsProductCategory>> getProductCategoryList(@RequestBody @PathVariable("id") Long id);

    @RequestMapping(value = "/api/v1/category/{id}", method = RequestMethod.GET, consumes = "application/json")
    CommonResult<PmsProductCategory> getProductCategoryById(@PathVariable("id") Long id);
}
