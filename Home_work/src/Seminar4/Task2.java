//package Seminar4;
//import java.util.LinkedList;
//class MyQueue<T> {
//        // Напишите свое решение ниже
//    LinkedList<T> tmpr=new LinkedList<T>();
//    public void enqueue(T element){
//        // Напишите свое решение ниже
//tmpr.addLast(element);
//
//    public T dequeue(){
//        // Напишите свое решение ниже
//        return tmpr.removeFirst();
//    }
//
//    public T first(){
//        // Напишите свое решение ниже
//return tmpr.getFirst();
//    }
//
//    public LinkedList<T> getElements() {
//        // Напишите свое решение ниже
//return tmpr;
//    }
//}
//
//
//public class Task2 {
//    public static void main(String[] args) {
//        MyQueue<Integer> queue;
//        queue = new MyQueue<>();
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            queue.enqueue(1);
//            queue.enqueue(10);
//            queue.enqueue(15);
//            queue.enqueue(5);
//        } else {
//            queue.enqueue(Integer.parseInt(args[0]));
//            queue.enqueue(Integer.parseInt(args[1]));
//            queue.enqueue(Integer.parseInt(args[2]));
//            queue.enqueue(Integer.parseInt(args[3]));
//        }
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
//    }
//}
