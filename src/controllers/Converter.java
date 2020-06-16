package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @GetMapping("/convert")

    public String convert(@RequestParam double amount, Model model){
        double amount1 = amount * 22500;
        model.addAttribute("amount", amount1);
        return "index";
    }
}
