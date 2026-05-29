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
    public long add(
            @RequestParam long a,
            @RequestParam long b
    ) {
        return arithmeticService.add(a, b);
    }

    @GetMapping("/subtract")
    public long subtract(
            @RequestParam long a,
            @RequestParam long b
    ){
        return arithmeticService.substract(a,b);
    }

    @GetMapping ("/multiply")
    public long multiply(
            @RequestParam long a,
            @RequestParam long b
    ) {
        return arithmeticService.multiply(a, b);
    }

    @GetMapping("/divide")
    public long divide(
            @RequestParam long a,
            @RequestParam long b
    ) {
        return arithmeticService.divide(a, b);
    }
}

