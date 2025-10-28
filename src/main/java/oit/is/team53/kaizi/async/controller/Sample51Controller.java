package oit.is.team53.kaizi.async.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import oit.is.team53.kaizi.async.model.*;



@Controller
@RequestMapping("/sample5")
public class Sample51Controller {
    
    @Autowired
    FruitMapper fMapper;

    @GetMapping("step1")
    public String step1() {
        return "sample51.html";
    }

    @GetMapping("step2")
    public String step2(ModelMap model) {
        ArrayList<Fruit> fruits = fMapper.selectAllFruit();
        model.addAttribute("fruits", fruits);
        return "sample51.html";
    } 
    
}
