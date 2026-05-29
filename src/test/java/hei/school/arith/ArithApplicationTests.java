package hei.school.arith;

import hei.school.arith.service.ArithmeticService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ArithApplicationTests {
    private final ArithmeticService arithmeticService = new ArithmeticService();

    @Test
    void testAdd() {
        long result = arithmeticService.add(50, 50);
        Assertions.assertEquals(3, result);
    }


    @Test
    void testSubtract() {
        long result = arithmeticService.substract(10 , 7);
        Assertions.assertEquals(3, result);
    }

    @Test
    void testMultiply() {
        long result = arithmeticService.multiply(10, 7);
        Assertions.assertEquals(70, result);
    }

    @Test
    void testDivide() {
        long result = arithmeticService.divide(10, 2);
        Assertions.assertEquals(5, result);
    }
}
