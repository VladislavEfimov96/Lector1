package lab1;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        /*6.Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
        «нулевое число», «положительное нечетное число» и т. д.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");// Вводим символа
        int x = in.nextInt();
        String s="";
        if(x>0){
            s="Положительное";
        }else if(x==0){
            s="Нулевое";
        }else if(x<0){
            s="Отрицательное";
        }
        if(x!=0){
            if((x%2)==0){
                s+=" четное";
            }else{
                s+=" не четное";
            }
        }
        System.out.println(s);
    }
}