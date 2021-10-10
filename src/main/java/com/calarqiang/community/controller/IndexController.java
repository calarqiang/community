package com.calarqiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yq
 * @create 2021-10-10-19:56
 */
@Controller
public class IndexController {
    @RequestMapping
    public String getIndex(){
        return "index";
    }
}
