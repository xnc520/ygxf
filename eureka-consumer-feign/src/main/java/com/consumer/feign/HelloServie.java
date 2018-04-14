package com.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:xuecx
 * @CreateDate: 2018/4/14.
 * @QQ:1276162287
 * @Discription:
 */
@FeignClient(value = "service-hi")
public interface HelloServie {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(String name);
}
