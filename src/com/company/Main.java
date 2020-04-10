package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Basics Task 1-2

        //Task 1.1 Приветствовать любого пользователя при вводе его имени через командную строку.
        /*System.out.println("Please introduce yourself.");
        Scanner scanner = new Scanner(System.in);
        String ConsoleReader = scanner.next();
        System.out.println("Hello, " + ConsoleReader + ".");*/


        //Task 1.2 Отобразить в окне консоли аргументы командной строки в обратном порядке.
        /*String ReverseOrder = "";
        for (int i = args.length - 1; i >= 0; i--) {
            ReverseOrder = ReverseOrder + " " + args[i];
            if (i == 0) {
                System.out.println(ReverseOrder);
            }
        }*/

        //Task 1.3 Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        // без перехода на новую строку - выполнено в 1.2, с переходом на новую строку - задала условие что после 5 элемента переход осуществляетьсяб остаток выводиться новой строкой
        /*int Count = 0;
        String ArgFiveElem = "";
        for (int i = 0; args.length > i; i++) {
            ArgFiveElem += args[i] + " ";
            Count++;
            if (Count == 5) {
                System.out.println(ArgFiveElem);
                Count = 0;
                ArgFiveElem = "";
            }
        }
        System.out.println(ArgFiveElem);*/

        //Task 1.4 Ввести пароль из командной строки и сравнить его со строкой-образцом
        /*boolean TrueValue = true;
        while (TrueValue) {
            System.out.println("Please enter the password:");
            Scanner scanner = new Scanner(System.in);
            String ConsoleReader = scanner.next();
            switch (ConsoleReader) {
                case ("Qwerty!"):
                    System.out.println("Welcome");
                    TrueValue = false;
                    break;
                default:
                    System.out.println("Your password is not correct");
                    break;
            }
        }*/

        //Task 1.5 Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        /*int Sum = 0;
        int Composite = 1;
        for (int i = 0; args.length > i; i++) {
            Sum += Integer.parseInt(args[i]);
            Composite *= Integer.parseInt(args[i]);
        }
        System.out.println(Sum);
        System.out.println(Composite);*/

        //Task 1.6.1 Вывести на консоль четные и нечетные числа.
        /*String EvenNumbers = "";
        String OddNumbers = "";
        for (int i = 0; args.length > i; i++) {
            int CalNumbers = Integer.parseInt(args[i]);
            if (CalNumbers % 2 == 0) {
                EvenNumbers += CalNumbers + " ";
            } else {
                OddNumbers += CalNumbers + " ";
            }
        }
        System.out.println("The following numbers are even: " + EvenNumbers);
        System.out.println("The following numbers are odd: " + OddNumbers);*/

        //Task 1.6.2 Вывести на консоль наибольшее и наименьшее число.
        /*int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);
        for (int i = 1; args.length > i; i++) {
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
            if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);*/

        //Task 1.6.3 Вывести на консоль числа, которые делятся на 3 или на 9.
        /*String NumbersDivided = "";
        for (int i = 0; args.length > i; i++) {
            int CalNumbers = Integer.parseInt(args[i]);
            if (CalNumbers % 3 == 0 || CalNumbers % 9 == 0) {
                NumbersDivided += CalNumbers + " ";
            } else {
            }
        }
        System.out.println("Multiples of three or nine: " + NumbersDivided);*/

        //Task 1.6.4 Вывести на консоль числа, которые делятся на 5 и на 7.
        /*String NumbersDivided = "";
        for (int i = 0; args.length > i; i++) {
            int CalNumbers = Integer.parseInt(args[i]);
            if (CalNumbers % 7 == 0 && CalNumbers % 5 == 0) {
                NumbersDivided += CalNumbers + " ";
            } else {
            }
        }
        System.out.println("Result: " + NumbersDivided);*/

        //Task 1.6.5  Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        /*String ResultValues = "";
        for (int i = 100; i < 999; i++) {
            String result1 = Integer.toString(i);
            char Units = result1.charAt(2);
            char Decimal = result1.charAt(1);
            if (Units != Decimal) {
                ResultValues += i + " ";
            }
        }
        System.out.println(ResultValues);*/

        //Task 1.6.6  Счастливые» числа.
        /*for (int i = 0; args.length > i; i++) {
            if (args[i].length() % 2 == 0) {
                int count = 0;
                int firstPart = 0;
                int secondPart = 0;
                int o = args[i].length() / 2;
                char[] el = args[i].toCharArray();
                for (int j = 0; el.length > j; j++) {
                    if (o > count) {
                        firstPart += Character.getNumericValue(el[j]);
                        count++;
                    } else {
                        secondPart += Character.getNumericValue(el[j]);
                    }
                }
                if (firstPart == secondPart) {
                    System.out.println("Happy value :" + args[i]);
                }
            }
        }*/


    }
}