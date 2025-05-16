package com.medicnote.medicnote;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // For UI Test
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
