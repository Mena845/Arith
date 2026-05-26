package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public int add(int a, int b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
