package com.lohtech.swarm.portal.feign;


import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.portal.fallback.ProductFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "swarm-product", fallback = ProductFeignClientFallback.class)
public interface ProductFeignClient {

    @GetMapping("/api/v1/product/category")
    CommonResult<List<PmsProductCategory>> getProductCategoryList(@PathVariable Integer id);
}
