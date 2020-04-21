package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Forward
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/18 17:38
 * @Version 1.0
 */
@Controller
public class Forward {

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }
}
