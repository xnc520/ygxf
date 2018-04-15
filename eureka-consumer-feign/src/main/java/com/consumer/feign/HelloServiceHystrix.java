package com.consumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:xuecx
 * @CreateDate: 2018/4/15.
 * @QQ:1276162287
 * @Discription:
 */
@Component
public class HelloServiceHystrix implements HelloServie {
    @Override
    public String hi(@RequestParam(value = "name") String name) {
        return "sorry "+name+",服务器出故障！";
    }
}
