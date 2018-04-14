package com.xuecx.ribbon;

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
    public String hi(String name){
        return template.getForObject("http://service-hi/hi?name="+name,String.class);
    }
}
