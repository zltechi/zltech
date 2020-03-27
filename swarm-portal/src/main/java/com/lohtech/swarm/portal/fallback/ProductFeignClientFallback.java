package com.lohtech.swarm.portal.fallback;

import com.lohtech.swarm.common.api.CommonPage;
import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.model.product.pojo.PmsProductCategory;
import com.lohtech.swarm.portal.feign.ProductFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductFeignClientFallback implements ProductFeignClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductFeignClientFallback.class);

    @Override
    public CommonResult<CommonPage<PmsProductCategory>> getProductCategoryList(Long id) {
        LOGGER.info("----------->  hystrix capture request from request getProductCategoryList");
        return CommonResult.failed();
    }

    @Override
    public CommonResult<PmsProductCategory> getProductCategoryById(Long id) {
        LOGGER.info("----------->  hystrix capture request from request getProductCategoryById");
        return CommonResult.failed();
    }

}
