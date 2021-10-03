package lab1;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        //5.Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");// Вводим число x
        int x = in.nextInt();
        System.out.println("Введите x1");// Вводим число x1
        int x1 = in.nextInt();
        System.out.println("Введите x2");// Вводим число x2
        int x2 = in.nextInt();
        int min = x1;
        if(x1<min){
            min=x2;
        }
        if(x2<min){
            min=x2;
        }
        System.out.println(min);
    }
}