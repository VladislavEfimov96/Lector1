package lab1;

public class number9 {
    public static void main(String[] args) {
        /*9. Дан массив целых чисел: [15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52].
        Переставить элементы массива в обратном порядке. Вывести результат в консоль.*/
        int [] array = new int [] {15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};
        int[] array1;
        array1 = new int[array.length];
        int j=array.length-1;
        for(int i=0;i<array.length;i++) {
            array1 [i]=array [j];
            j--;
        }
        for(int i=0;i<array1.length;i++) {
            if(i<array1.length-1){
                System.out.print(array1[i]+",");
            }else{
                System.out.print(array1[i]);
            }
        }
    }
}

