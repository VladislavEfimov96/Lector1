package lab1;

import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        /*4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1;
        если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x"); // Ввод значение x
        int x= in.nextInt();
        if(x>0){
            x++;
        }
        if(x==0){
            x=10;
        }
        if(x<0){
            x-=2;
        }
        System.out.println(x);
    }
}