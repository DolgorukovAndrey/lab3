import java.util.Scanner;
import java.util.ArrayList;

public class Methods {
    Scanner scanner = new Scanner(System.in);

    public int inputInt() {
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;

            } else {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next();
            }
        }
        return number;
    }

    public void task12() {
        System.out.println("Задание 1.2");
        Person person11 = new Person("Клеопатра", 152);
        Person person12 = new Person();
        person12.setSurname("Пушкин");
        person12.setHeight(167);
        Person person13 = new Person("Владимир", 189);
        System.out.println(person11.toString());
        System.out.println(person12.toString());
        System.out.println(person13.toString());
        System.out.println("Задание 1.3");
        Name name1 = new Name(null,"Клеопатра",null);
        Name name2 = new Name("Пушкин","Александр","Сергеевич");
        Name name3 = new Name("Маяковский","Владимир",null);
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());
        System.out.println("Задание 2.2");
        Person person21 = new Person("Клеопатра", 152);
        Person person22 = new Person("Пушкин", "Александр", "Сергеевич", 167);
        Person person23 = new Person("Владимир", 189);
        person23.setSurname("Маяковский");
        System.out.println(person21.toString());
        System.out.println(person22.toString());
        System.out.println(person23.toString());
    }

    public void task34() {
        Way way1 = new Way();
        Way way2 = new Way();
        Way way3 = new Way();
        Way way4 = new Way();
        Way way5 = new Way();
        Way way6 = new Way();
        Way way7 = new Way();
        Way way8 = new Way();
        Way way9 = new Way();
        Way way10 = new Way();
        Way way11 = new Way();
        Way way12 = new Way();
        Way way13 = new Way();
        ArrayList<Way> ways1 = new ArrayList<>();
        way1.setTitlePrice("B", 5);
        way2.setTitlePrice("F", 1);
        way3.setTitlePrice("D", 6);
        ways1.add(way1);
        ways1.add(way2);
        ways1.add(way3);
        Cities city1 = new Cities("A", ways1);
        ways1.clear();
        way4.setTitlePrice("A", 5);
        way5.setTitlePrice("C", 3);
        ways1.add(way4);
        ways1.add(way5);
        Cities city2 = new Cities("B", ways1);
        ways1.clear();
        way6.setTitlePrice("B", 3);
        way7.setTitlePrice("D", 4);
        ways1.add(way6);
        ways1.add(way7);
        Cities city3 = new Cities("C", ways1);
        ways1.clear();
        way8.setTitlePrice("C", 4);
        way9.setTitlePrice("E", 2);
        way10.setTitlePrice("A", 6);
        ways1.add(way8);
        ways1.add(way9);
        ways1.add(way10);
        Cities city4 = new Cities("D", ways1);
        ways1.clear();
        way11.setTitlePrice("F", 2);
        ways1.add(way11);
        Cities city5 = new Cities("E", ways1);
        ways1.clear();
        way12.setTitlePrice("B", 1);
        way13.setTitlePrice("E", 2);
        ways1.add(way12);
        ways1.add(way13);
        Cities city6 = new Cities("F", ways1);
        ways1.clear();
        System.out.println(city1.toString());
        System.out.println(city2.toString());
        System.out.println(city3.toString());
        System.out.println(city4.toString());
        System.out.println(city5.toString());
        System.out.println(city6.toString());
    }

    public void task5() {
        Fraction fraction1 = new Fraction(16, -7);
        Fraction fraction2 = new Fraction(4, 9);
        Fraction fraction3 = new Fraction().divisionint(fraction1,-2);
        System.out.println("f1 = " + fraction1);
        System.out.println("f2 = " + fraction2);
        System.out.println("Запись выражения в новую дробь f3 (работает), также работает обработка отрицательных значений");
        System.out.println(fraction1 + " / (-2) = " + fraction3);
        Fraction fraction4 = new Fraction().divisionint(fraction1,0);
        System.out.println("f4 = " + fraction4.toString());
        System.out.println("Поптыка записать в уже существующую дробь f2 (не изменяется)");
        fraction2.divisionint(fraction1,-2);
        System.out.println(fraction1 + " / (-2) = " + fraction2);
    }

}
