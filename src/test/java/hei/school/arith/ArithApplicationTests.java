package hei.school.arith;

import hei.school.arith.service.ArithmeticService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArithApplicationTests {
    private final ArithmeticService arithmeticService = new ArithmeticService();

    @Test
    void testAdd() {
        double result = arithmeticService.add(1, 2);
        Assertions.assertEquals(3, result);
    }


    @Test
    void testSubtract() {
        double result = arithmeticService.substract(10 , 7);
        Assertions.assertEquals(3, result);
    }

    @Test
    void testMultiply() {
        double result = arithmeticService.multiply(10, 7);
        Assertions.assertEquals(70, result);
    }

    @Test
    void testDivide() {
        double result = arithmeticService.divide(10, 2);
        Assertions.assertEquals(5, result);
    }
}
