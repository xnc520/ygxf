package com.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:xuecx
 * @CreateDate: 2018/4/14.
 * @QQ:1276162287
 * @Discription:
 */
@FeignClient(value = "service-hi",fallback = HelloServiceHystrix.class)
public interface HelloServie {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
