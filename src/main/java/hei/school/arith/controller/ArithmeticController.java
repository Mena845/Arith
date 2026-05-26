package hei.school.arith.controller;

import hei.school.arith.service.ArithmeticService;
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

    @GetMapping("/subtract")
    public int subtract(
            @RequestParam int a,
            @RequestParam int b
    ){
        return arithmeticService.substract(a,b);
    }

    @GetMapping ("/multiply")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return arithmeticService.multiply(a, b);
    }

    @GetMapping("/divide")
    public int divide(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return arithmeticService.divide(a, b);
    }
}

