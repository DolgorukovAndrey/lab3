package ru.Dolgorukov.main;

interface ConvertDouble {
    double toDouble();
}

class Integer implements ConvertDouble {
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public double toDouble() {
        return (double) value;
    }
}

class Fraction implements ConvertDouble {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public double toDouble() {
        return (double) numerator / denominator;
    }
}


public class Sum {
    public static double sum(ConvertDouble... numbers) {
        double result = 0.0;
        for (ConvertDouble number : numbers) {
            result += number.toDouble();
        }
        return result;
    }
}

