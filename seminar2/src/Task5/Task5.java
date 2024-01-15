//package Task5;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Task5 {
//    public static void main(String[] args){
//        try {
//            FileInputStream fos = new FileInputStream("example.txt");
//
//            // Строка для записи
//            String str = "Hello, Java!";
//
//            // Преобразуем строку в массив байтов и записываем в файл
//            fos.write(str.getBytes());
//            fos.close();
//
//            System.out.println("File written successfully");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
