package hei.school.arith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ArithmeticController {
    @GetMapping("/add")
    public int add(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a + b;
    }
}
