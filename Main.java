import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        int choice;
        System.out.println("Для выбора задания 1 и 2 введите 1");
        System.out.println("Для выбора задания 3 и 4 введите 2");
        System.out.println("Для выбора задания 5 введите 3");
        System.out.print("Введите номер задания от 1 до 3 (для завершения введите 0): ");
        choice = methods.inputInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    methods.task12();
                    break;
                case 2:
                    methods.task34();
                    break;
                case 3:
                    methods.task5();
                    break;
                default:
                    System.out.println("Такого задания нет");
                    break;
            }
            System.out.print("Введите номер задания от 1 до 3 (для завершения введите 0): ");
            choice = methods.inputInt();
        }
    }
}