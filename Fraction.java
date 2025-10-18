public final class Fraction extends Number{
    final private int numerator;
    final private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalStateException("Ошибка деления на 0");
        }
        int a = numerator;
        int b = denominator;
        int temp;
        while (b != 0)  {
            temp = b;
            b = a % b;
            a = temp;
        }
        numerator = numerator / a;
        denominator = denominator / a;
        if (numerator < 0 && denominator < 0) {
            numerator = numerator * (-1);
            denominator = denominator * (-1);
        }
        if (numerator >= 0 && denominator < 0) {
            numerator = numerator * (-1);
            denominator = denominator * (-1);
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction addition(Fraction summand1, Fraction summand2) {
        int summNumerator = summand1.numerator * summand2.denominator + summand2.numerator * summand1.denominator;
        int summDumerator = summand1.denominator * summand2.denominator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction subtraction(Fraction summand1, Fraction summand2) {
        int summNumerator = summand1.numerator * summand2.denominator - summand2.numerator * summand1.denominator;
        int summDumerator = summand1.denominator * summand2.denominator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction multiplication(Fraction summand1, Fraction summand2) {
        int summNumerator = summand1.numerator * summand2.numerator;
        int summDumerator = summand1.denominator * summand2.denominator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction division(Fraction summand1, Fraction summand2) {
        if (summand2.numerator == 0) {
            throw new IllegalStateException("Ошибка деления на 0");
        }
        int summNumerator = summand1.numerator * summand2.denominator;
        int summDumerator = summand1.denominator * summand2.numerator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction additionInt(Fraction summand1, int n) {
        int summNumerator = summand1.numerator + n * summand1.denominator;
        int summDumerator = summand1.denominator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction subtractionint(Fraction summand1, int n) {
        int summNumerator = summand1.numerator - n * summand1.denominator;
        int summDumerator = summand1.denominator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction multiplicationint(Fraction summand1, int n) {
        int summNumerator = summand1.numerator * n;
        int summDumerator = summand1.denominator;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public Fraction divisionint(Fraction summand1, int n) {
        if (n == 0) {
            throw new IllegalStateException("Ошибка деления на 0");
        }
        int summNumerator = summand1.numerator;
        int summDumerator = summand1.denominator * n;
        Fraction summ = new Fraction(summNumerator,summDumerator);
        return summ;
    }

    public String toString() {
        if (numerator != 0 && denominator != 0) {
            return numerator + "/" + denominator;
        } else {
            return "0";
        }
    }
}
