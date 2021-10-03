package lab1;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        //2.Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x"); //ввод числа
        int x = in.nextInt();
        String s = ""+x;
        String[] a = s.split("");
        int val=0;
        for(int i=0;i<a.length;i++){
            val+=Integer.parseInt(a[i]);
        }
        System.out.println(val);
    }
}
