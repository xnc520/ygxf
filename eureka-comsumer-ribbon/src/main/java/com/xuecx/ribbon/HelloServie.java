package com.xuecx.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:xuecx
 * @CreateDate: 2018/4/14.
 * @QQ:1276162287
 * @Discription:
 */
@Service
public class HelloServie {
    @Autowired
    private RestTemplate template;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return template.getForObject("http://service-hi/hi?name="+name,String.class);
    }
    public String hiError(String name){
        return "Hi "+name+",服务器出故障了";
    }
}
