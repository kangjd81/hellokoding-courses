package com.hellokoding.springboot;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	Random ran = new Random();
	String appId = String.valueOf(ran.nextInt(1000));

	@GetMapping("/")
    public String index(Model model) {
    	
		model.addAttribute("appId", appId);
        return "index";
    }
}
