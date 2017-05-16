package com.heysteve.heygym.heycore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by marti on 14/5/2017.
 * Prueba by Daro
 */
@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Proudly handcrafted by " +
                "<a href='http://netgloo.com/en'>netgloo</a> :)";
    }

    @RequestMapping("/2")
    public String testOne(HttpServletResponse response){
        return "redirect:/stamina/index.html";
    }
}