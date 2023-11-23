package com.mcloudoc.day01_1.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Home {

    public Home(){
        System.out.println(getClass().getName() + "() 생성");
    }

    @RequestMapping("/home")
    public String index(){
        return "/hello";
    }

}
