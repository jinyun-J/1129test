package com.std.sbb1128;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }
}
