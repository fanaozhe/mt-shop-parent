package com.mayikt.weixin.api.service;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fanaz
 * @create 2020-06-25-21:08
 */
public interface WeiXinService {

   @GetMapping("/getAppInfo")
    String getAppInfo(long userId);
}
