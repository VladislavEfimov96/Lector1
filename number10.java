package lab1;

public class number10 {
    public static void main(String[] args) {
        /*10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52].
        Переместить нули в конец массива. Вывести результат в консоль.*/
        int [] array = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
        int [] new_array;
        new_array= new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]!=0){
                System.out.print(array[i]+",");
                j++;
            }
        }
        for(int k=j ;k<array.length;k++){
            if(k<array.length-1){
                System.out.print("0,");
            }else{
                System.out.print("0");
            }
        }

    }
}
