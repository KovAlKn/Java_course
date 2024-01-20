package Seminar3;
import java.util.Arrays;
import java.util.ArrayList;
public class Task2 {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                ArrayList.add(integer);
            }
        }
    System.out.println(ArrayList);
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    class Printer{
        public static void main(String[] args) {
            Integer[] arr = {};

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                arr = new Integer[]{2, 4, 6, 8, 9, 10};
            }
            else{
                arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
            }

            Task2 ans = new Task2();
            ans.removeEvenNumbers(arr);
        }
    }

    //'1, 2, 3, 4, 5, 6, 7, 8, 9'
//'-2, -1, 0, 1, 2, 3, 4, 5'  =>[-1, 1, 3, 5]
//'2, 4, 6, 8, 9, 10'  =>[9]
