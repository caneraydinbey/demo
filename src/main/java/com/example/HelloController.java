package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by caneraydin on 06.03.2016.
 */

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method= RequestMethod.GET)

    public String printWelcome(ModelMap model){
        model.addAttribute("message","Hello world!");
        return "hello";
    }



}
