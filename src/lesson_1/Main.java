package lesson_1;

import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 14.12.2023
 * @project TMS_AnOnl_17_Java
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача №1
        System.out.println("Hello world!");
        System.out.println();

        //Задача №2
        System.out.print("Введите имя пользователя: ");
        System.out.print("Hello " + scanner.nextLine() + "!");
        System.out.println();

        //Задача №3
        System.out.println("Считаем сумму двух чисел.");
        System.out.print("Введите первое число: ");
        int numberA = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int numberB = scanner.nextInt();
        System.out.println("Сумма чисел " + numberA + " и " + numberB + " равна " + (numberA + numberB));

    }
}