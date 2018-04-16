package com.xuecx.zinkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:xuecx
 * @CreateDate: 2018/4/16.
 * @QQ:1276162287
 * @Discription:
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate template;
    @GetMapping(value = "/hi")
    public String hi(String name){
        return template.getForObject("http://testsleuthzipkin/hi1?name="+name,String.class);
    }
    @GetMapping(value = "/hi1")
    public String hi1(String name){
        return "i am "+name;
    }
}
