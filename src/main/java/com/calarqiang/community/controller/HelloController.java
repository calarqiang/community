package com.calarqiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yq
 * @create 2021-10-10-18:25
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String getHello(@RequestParam(name="name")String name,Model model){
       //必须将接收的参数传递给model之后，才可以继续往下走
        model.addAttribute("name",name);
        return "hello";
    }

}
