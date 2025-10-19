package ru.Dolgorukov.main;

import static ru.Dolgorukov.main.Sum.sum;

public class TestSum {
    public void testSum(){
        double result1 = sum(new Integer(2), new Fraction(3, 5), new Fraction(23, 10));
        System.out.println("2 + 3/5 + 2.3 = " + result1);
        double result2 = sum(new Fraction(36, 10), new Fraction(49, 12), new Integer(3), new Fraction(3, 2));
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2);
        double result3 = sum(new Fraction(1, 3), new Integer(1));
        System.out.println("1/3 + 1 = " + result3);
    }
}
