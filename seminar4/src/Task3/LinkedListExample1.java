package Task3;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Третий");


        // Удаляем и получаем первый элемент списка
        String removedElement = linkedList.removeFirst();

        System.out.println("Удаленный первый элемент: " + removedElement);
        System.out.println("Список после удаления: " + linkedList);

        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Третий");

        // Удаляем и получаем первый элемент списка
        String removedElement1 = linkedList.removeLast();
        //ЕСли список пуст вернет исключение java.util.NoSuchElementException

        System.out.println("Удаленный первый элемент: " + removedElement1);
        System.out.println("Список после удаления: " + linkedList);

        // Удаляем и получаем последний элемент списка
        String removedElement2 = linkedList.pollLast();
        //ЕСли список пуст вернет null

        System.out.println("Удаленный последний элемент: " + removedElement2);
        System.out.println("Список после удаления: " + linkedList);

        // Добавляем элемент в начало списка
        linkedList.offerFirst("Новый элемент в начало");
        //Если список переполнен вернет false и элемент не будет добавлен в список
        //linkedList.addFirst("") вернет исключение IllegalStateException


    }
}
