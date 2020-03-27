package com.lohtech.swarm.user.controller;

import com.lohtech.swarm.common.api.CommonResult;
import com.lohtech.swarm.common.api.ResultCode;
import com.lohtech.swarm.model.user.pojo.UmsAdmin;
import com.lohtech.swarm.user.dto.UmsAdminLoginParam;
import com.lohtech.swarm.user.dto.UmsAdminParam;
import com.lohtech.swarm.user.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@Api(tags = {"AdminController"}, description = "后台用户管理")
public class UmsAdminController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminController.class);

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Value(("${jwt.tokenHeader}"))
    private String tokenHeader;

    @Autowired
    private UmsAdminService umsAdminService;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsAdmin> register(@RequestBody @Valid UmsAdminParam param, BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(ResultCode.VALIDATE_FAILED);
        }

        UmsAdmin admin = umsAdminService.register(param);
        if (admin == null) {
            return CommonResult.failed("用户已注册");
        }

        return CommonResult.success(admin);
    }

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Map<String, String>> login(@RequestBody @Valid UmsAdminLoginParam param, BindingResult result) {

        LOGGER.info("-----------------------> login");

        if (result.hasErrors()) {
            LOGGER.info("-----------------------> result.hasErrors()");
            return CommonResult.failed(ResultCode.VALIDATE_FAILED);
        }

        String token = umsAdminService.login(param.getUsername(), param.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }

        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);

        return CommonResult.success(tokenMap);
    }

//    @RequestMapping("/test")
//    @ResponseBody
//    public Object test() {
//        return "test";
//    }
}
