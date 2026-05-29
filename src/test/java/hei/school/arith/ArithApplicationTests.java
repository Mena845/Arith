package hei.school.arith;

import hei.school.arith.service.ArithmeticService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ArithApplicationTests {
    //    asaina instancieny spring
    private final ArithmeticService arithmeticService = new ArithmeticService();
    @Test
    void testAdd() {
        long result = arithmeticService.add(50000000000L, 5000000000L);
        assertEquals(3, result);
    }


    @Test
    void testSubtract() {
        long result = arithmeticService.substract(10 , 7);
        assertEquals(3, result);
    }

    @Test
    void testMultiply() {
        long result = arithmeticService.multiply(10, 7);
        assertEquals(70, result);
    }

    @Test
    void testDivide() {
        long result = arithmeticService.divide(10, 2);
        assertEquals(5, result);
    }
}
