package com.cdc.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/18.
 */
@Controller
public class HelloController {

    /*@RequestMapping("/")
    public ModelAndView inx(ModelMap map){

        ModelAndView mav = new ModelAndView();
        mav.addObject("host", "http:didispace.come");
        *//*map.addAttribute("host", "http:didispace.come");*//*
        System.out.println("sssssssssssssssssssssss");
        mav.setViewName("index");
        return mav;
    }*/

    @RequestMapping("/index")
    public String thymeleaf(ModelMap map){
        map.addAttribute("host","host:localhost");
        return "index";
    }

    @Value("@{application.message:Hello World}")
    private String message = "hello world";

    @RequestMapping("/hello")
    public String index(ModelMap model){
        model.put("time", new Date());
        model.put("message", this.message);
        System.out.println("cdc  to github");
        return "Hello";
    }



}
