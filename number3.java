package lab1;

import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        /*3.Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1,
         в противном случае не изменять его. Вывести полученное число.
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");//Ввод числа
        int x = in.nextInt();
        if(x>0){
            x++;
        }
        System.out.println (x);
    }
}