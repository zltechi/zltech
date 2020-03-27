package com.lohtech.swarm.user.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.lohtech.swarm.model.user.mapper.UmsAdminMapper;
import com.lohtech.swarm.model.user.pojo.UmsAdmin;
import com.lohtech.swarm.model.user.pojo.UmsAdminExample;
import com.lohtech.swarm.model.user.pojo.UmsPermission;
import com.lohtech.swarm.user.bean.AdminUserDetails;
import com.lohtech.swarm.user.dao.UmsAdminRoleRelationDao;
import com.lohtech.swarm.user.dto.UmsAdminLoginParam;
import com.lohtech.swarm.user.dto.UmsAdminParam;
import com.lohtech.swarm.user.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.Date;
import java.util.List;


@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UmsAdminMapper adminMapper;

    @Autowired
    private UmsAdminRoleRelationDao adminRoleRelationDao;


    @Override
    public UmsAdmin register(UmsAdminParam param) {
        UmsAdmin admin = new UmsAdmin();
        BeanUtil.copyProperties(param, admin);
        admin.setCreateTime(new Date());
        admin.setStatus(1);

        // 检查重名
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(admin.getUsername());
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList.size() > 0) {
            return null;
        }

        String encodePassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(encodePassword);
        adminMapper.insert(admin);

        return admin;
    }

    @Override
    public String login(String username, String password) {

        String token = "token";

        UserDetails userDetails = loadUserByUsername(username);
        if (passwordEncoder.matches(password, userDetails.getPassword())) {
            throw new BadCredentialsException("密码不正确");
        }
//        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//        SecurityContextHolder.getContext().setAuthentication(auth);

        //TODO 1 生成JWT
        //TODO 2 写log

        return token;
    }

    private UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    public List<UmsPermission> getPermissionList(Long id) {
        return adminRoleRelationDao.getPermissionList(id);
    }

    public UserDetails loadUserByUsername(String username) {
        UmsAdmin admin = getAdminByUsername(username);
        if (admin != null) {
            List<UmsPermission> permissionList = getPermissionList(admin.getId());
            return new AdminUserDetails(admin, permissionList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }
}
