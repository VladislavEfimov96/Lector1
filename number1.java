package lab1;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        //Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();
        int number = x % 10;
        System.out.println(number);
        }
    }
