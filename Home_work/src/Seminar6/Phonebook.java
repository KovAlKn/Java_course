package Seminar6;

import java.util.*;
import java.util.stream.Collectors;

//Задание
//
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
public class Phonebook {
    public static void main(String[] args) {
        //Создаем исходный телефонный справочник
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Андрей", "Дмитрий", "Мария", "Катя", "Григорий", "Миша"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(123321, 234432, 345543, 456654, 567765, 678876));
        for (int i = 0; i < names.size(); i++) {

            addContact(phoneBook, names.get(i), numbers.get(i));

        }
        System.out.println("Исходный справочник: " + phoneBook);
        addContact(phoneBook, "Катя", 989898);
        addContact(phoneBook, "Катя", 565656);
        addContact(phoneBook, "Андрей", 512521);
        addContact(phoneBook, "Мария", 777979);
        outPut(phoneBook);

    }

    private static void addContact(HashMap<String, ArrayList<Integer>> book, String name, Integer phone) {
        if (book.containsKey(name)) {
            ArrayList<Integer> phoneNumbers = new ArrayList<>(book.get(name));
            phoneNumbers.add(phone);
            book.put(name, phoneNumbers);
            System.out.println("Добавлен новый номер к записи: " + name);
        } else {
            ArrayList<Integer> newPhone = new ArrayList<>();
            newPhone.add(phone);
            book.put(name, newPhone);
            System.out.println("Создана новая запись с именем: " + name);
        }
    }

    private static void outPut(HashMap<String, ArrayList<Integer>> book) {
        int quantity;
        Map<String, Integer> quantityOfNumbers = new HashMap<>();
        for (String key : book.keySet()) {
            ArrayList<Integer> list = book.get(key);
            quantity = list.size();
            quantityOfNumbers.put(key, quantity);
        }
        Map<String, Integer> sortedQuantityOfNumbers = quantityOfNumbers.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
            throw new AssertionError();
        }, LinkedHashMap::new));
        for (HashMap.Entry<String, Integer> e : sortedQuantityOfNumbers.entrySet()) {
            System.out.println(e.getKey()+" тел. : " +book.get(e.getKey()));
            ;
        }
    }
}









