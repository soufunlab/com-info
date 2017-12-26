package com.info.controller;

import com.info.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private AppConfig appConfig;

    @RequestMapping("/")
    String home(Model model) {

        return "index";
    }
}
