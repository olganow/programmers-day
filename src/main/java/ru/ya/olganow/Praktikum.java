package ru.ya.olganow;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("День программиста в " + year + " году 12 сентября"); }
        else
        { System.out.println("День программиста в " + year + " году 13 сентября");
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        // здесь нужно определить, является ли переданный год високосным
        if ( (year%100 == 0) && (year%4 == 0)  ) isLeapYear = true;
        return isLeapYear;
    }

}

