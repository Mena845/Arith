package hei.school.arith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController {
    private final ArithmeticService arithmeticService;
    public ArithmeticController (ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }
    @GetMapping("/add")
    public int add(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return arithmeticService.add(a, b);
    }
}
