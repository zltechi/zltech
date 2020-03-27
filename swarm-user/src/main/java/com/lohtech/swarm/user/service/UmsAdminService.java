package com.lohtech.swarm.user.service;

import com.lohtech.swarm.model.user.pojo.UmsAdmin;
import com.lohtech.swarm.user.dto.UmsAdminLoginParam;
import com.lohtech.swarm.user.dto.UmsAdminParam;

public interface UmsAdminService {
    UmsAdmin register(UmsAdminParam param);
    String login(String username, String password);
}
