package com.chenqiang.cq_app_info.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/jsp")
    public String jsp(Model model){
        model.addAttribute("msg","测试jsp页面！！！");
        return "myJsp";
    }

    @GetMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("msg","测试thymeleaf页面！！！");
        return "html/thymeleaf";
    }

    @GetMapping("/test")
    public String test(){
        return "developer/test";
    }

    @GetMapping("/footer")
    public String testfooter(){
        return "backend/common/footer2";
    }


}