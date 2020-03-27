package com.lohtech.swarm.portal.fallback;

import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.portal.feign.ProductFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignClientFallback implements ProductFeignClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductFeignClientFallback.class);

    @Override
    public CommonResult<Object> specificationList() {

        LOGGER.info("----------->  hystrix capture request");

        return CommonResult.failed();
    }
}
