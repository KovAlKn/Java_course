package Seminar3;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Task3 {
    public static void main(String[] args){
        Integer[] arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        Task3 ans = new Task3();
        ans.analyzeNumbers(arr);
    }
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer>array = new ArrayList<Integer>();
        Collections.addAll(array, arr);
        Collections.sort(array);
        int Maximum = array.get(arr.length-1);
        int Minimum=array.get(0);
        double Average=0;
        double sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        Average = sum/arr.length;
        System.out.println(array);
        System.out.println("Minimum is "+ Integer.toString(Minimum));
        System.out.println("Maximum is "+ Integer.toString(Maximum));
        System.out.println("Average is = "+ Double.toString(Average));
    }
}
//4, 2, 7, 5, 1, 3, 8, 6, 9
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//Minimum is 1
//Maximum is 9
//Average is = 5.0

//-2, -1, 0, 1, 2, 3, 4, 5
//[-2, -1, 0, 1, 2, 3, 4, 5]
//        Minimum is -2
//        Maximum is 5
//        Average is = 1.5

//10, 20, 30, 40, 50
//[10, 20, 30, 40, 50]
//Minimum is 10
//Maximum is 50
//Average is = 30.0

//1, 3, 5, 7, 9
//[1, 3, 5, 7, 9]
//Minimum is 1
//Maximum is 9
//Average is = 5.0