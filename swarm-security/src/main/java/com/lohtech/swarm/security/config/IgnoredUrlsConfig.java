package com.lohtech.swarm.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于配置不需要保护的资源
 */
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoredUrlsConfig {

    private List<String> urls = new ArrayList<>();

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getUrls() {
        return urls;
    }
}
