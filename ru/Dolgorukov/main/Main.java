package ru.Dolgorukov.main;

import ru.Dolgorukov.fraction.TestFraction;
import ru.Dolgorukov.city.TestCity;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
            double result = power(args[0], args[1]);
            System.out.println(args[0] + " ^ " + args[1] + " = " + result);
        }
        Scanner scanner = new Scanner(System.in);
        TestFraction test1 = new TestFraction();
        TestCity test2 = new TestCity();
        TestSum test3 = new TestSum();
        System.out.println("Выберите тест для запуска:");
        System.out.println("1 - testFraction()");
        System.out.println("2 - testCity()");
        System.out.println("3 - testSum()");
        System.out.print("Введите номер (1-3): ");
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                break;

            } else {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next();
            }
        }
        switch (choice) {
            case 1:
                test1.testFraction();
                break;
            case 2:
                test2.testCity();
                break;
            case 3:
                test3.testSum();
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }

    }

    public static double power(String xStr, String yStr) {
        double x = parseInt(xStr);
        double y = parseInt(yStr);
        return pow(x, y);
    }
}
