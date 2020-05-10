package ru.mail.sheingrisha.gritter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Shein G.A. at 29.04.20
 **/


@Controller
public class GritterController {

    @GetMapping("/greeting")
    public String greeting (@RequestParam(name="name", required = false, defaultValue = "World") String name,
                            Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/mustache")
    public String mustacheGreeting(Map<String, Object> model) {
        model.put("param", "Hello, Mustache. Usually it's simpliest way to start with mustache then with thyme-lief");
        return "greetFromMustache";
    }
}
