package hei.school.arith.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public long add(long a, long b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed for addition");
        }
        return a + b;
    }

    public long substract(long a, long b) {
        if(a < b) {
            throw new IllegalArgumentException("a must be greater than or equal to b");
        }
        return a - b;
    }
    public long multiply(long a, long b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a * b;
    }

    public long divide(long a, long b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        if (a <0 || b<0) {
            throw new IllegalArgumentException("Negative numbers are not allowed for division");
        }
        return a / b;
    }
}
