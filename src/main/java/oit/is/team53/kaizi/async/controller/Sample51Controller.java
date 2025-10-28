package oit.is.team53.kaizi.async.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample5")
public class Sample51Controller {
    
    @GetMapping("step1")
    public String step1() {
        return "sample51.html";
    }
    
}
