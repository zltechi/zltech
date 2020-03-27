package com.lohtech.swarm.portal.controller;

import com.lohtech.swarm.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "HomeController", description = "首页")
@RequestMapping("/home")
public class HomeController {

    @ApiOperation(value = "首页")
    @RequestMapping(value = "/content", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> home() {
        return CommonResult.success("Home");
    }
}
