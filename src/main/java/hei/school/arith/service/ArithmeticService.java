package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public int add(int a, int b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed for addition");
        }
        return a + b;
    }

    public int substract(int a, int b) {
        if(a < b) {
            throw new IllegalArgumentException("a must be greater than or equal to b");
        }
        return a - b;
    }
    public int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        if (a <0 || b<0) {
            throw new IllegalArgumentException("Negative numbers are not allowed for division");
        }
        return a / b;
    }
}
