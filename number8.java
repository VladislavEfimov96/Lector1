package lab1;

public class number8 {
    public static void main(String[] args) {
        /*8. Дан массив целых чисел: [1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2].
        Для данного массива найти и вывести на экран: максимальное значение,
        сумму положительных элементов, сумму четных отрицательных элементов,
        количество положительных элементов, среднее арифметическое отрицательных элементов.*/
        int [] array = new int[] {1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2};
        int max = array[0];
        int sumPlus = 0;
        int sumMinus=0;
        int positiveElelments=0;
        int neagtiveElelments=0;
        int negativeSum=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]>0){
                sumPlus+=array[i];
                positiveElelments+=1;
            }
            if(array[i]<0){
                negativeSum+=array[i];
                neagtiveElelments+=1;
                if((array[i]%2)==0){
                    sumMinus+=array[i];
                }
            }
        }
        int srd_arif= (negativeSum/neagtiveElelments);
        System.out.println("Максимальное значение: "+max+"\n"+"Сумма положительных элементов: "+sumPlus+"\n"+
                "Сумму четных отрицательных элементов: "+sumMinus+"\n"+"Количество положительных элементов: "+positiveElelments+"\n"
                +"Среднее арифметическое отрицательных элементов: "+srd_arif+"\n");
    }
}