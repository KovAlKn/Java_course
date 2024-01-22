package Seminar5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phoneNumbers = new ArrayList<>(phoneBook.get(name));
            phoneNumbers.add(phoneNum);
            phoneBook.put(name, phoneNumbers);
        }
        else{
            ArrayList<Integer>newPhone=new ArrayList<>();
            newPhone.add(phoneNum);
            phoneBook.put(name, newPhone);
        }
    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        else{
            return new ArrayList<Integer>();
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
        HashMap<String,ArrayList<Integer>> entries = phoneBook;
        return entries;
    }
}
// Не удаляйте этот класс - он нужен для


public class Task1 {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Carol";
            name2 = "Eve";
            phone1 = 555555;
            phone2 = 666666;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}
//Test1
//'Alice'
//'Bob'
//'123456'
//'789012'
//Answer
//[123456, 789012]
//{Bob=[789012], Alice=[123456, 789012]}
//[]

//Test2
//'David'
//'David'
//'111111'
//'222222'
//Answer
//[111111, 222222, 222222]
//{David=[111111, 222222, 222222]}
//[]

//Test3
//'Carol'
//'Eve'
//'555555'
//'666666'
//Answer
//[555555, 666666]
//{Eve=[666666], Carol=[555555, 666666]}
//[]