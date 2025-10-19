package ru.Dolgorukov.fraction;

public class TestFraction {
    public void testFraction() {
        Fraction fraction1 = new Fraction(16, -7);
        Fraction fraction2 = new Fraction(4, 9);
        Fraction fraction3 = new Fraction().divisionint(fraction1, -2);
        System.out.println("f1 = " + fraction1);
        System.out.println("f2 = " + fraction2);
        System.out.println("Запись выражения в новую дробь f3 (работает), также работает обработка отрицательных значений");
        System.out.println("f3 = " + fraction1 + " / (-2) = " + fraction3);
        System.out.println("Поптыка записать в уже существующую дробь f2 (не изменяется)");
        fraction2.divisionint(fraction1, -2);
        System.out.println("f2 = " + fraction1 + " / (-2) = " + fraction2);
        System.out.println("Попытка поделить на 0");
        try {
            Fraction fraction4 = new Fraction().divisionint(fraction1, 0);
            System.out.println("f4 = " + fraction4.toString());
        } catch (IllegalStateException e) {
            System.out.println("Перехвачена ошибка: " + e.getMessage());
        }
        Number number = fraction1;
        System.out.println("Fraction как Number: " + number);
        System.out.println("intValue(): " + number.intValue());
        System.out.println("longValue(): " + number.longValue());
        System.out.println("floatValue(): " + number.floatValue());
        System.out.println("doubleValue(): " + number.doubleValue());
    }
}
