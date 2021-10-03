package lab1;

import java.util.Scanner;

public class number7 {
    public static void main(String[] args) {
        /* 7.Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора
        в зависимости от кода города. (Москва(905) - 4.15 руб. Ростов(194) - 1.98 руб.
        Краснодар(491) - 2.69 руб. Киров(800) - 5.00руб.). Пользователь в консоли должен ввести код города,
        а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Введите n"); // Ввод значения n
        int n = in.nextInt();
        int Moscow = 905;
        int Rostov = 194;
        int Krasnodar = 491;
        int Kirov = 800;
        String rate="";
        if (n==Moscow) {
            rate = "Москва. Стоимость разговора: 41.5 руб";
        }
        else if(n==Rostov) {
            rate = "Ростов. Стоимость разговора: 19.8 руб";
        }
        else if(n==Krasnodar) {
            rate = "Краснодар. Стоимость разговора: 26.9 руб";
        }
        else if(n==Kirov) {
            rate = "Киров. Стоимость разговора: 50.0 руб";
        }
        else {
            rate="Такой код не найден";
        }
        System.out.println(rate);
    }
}