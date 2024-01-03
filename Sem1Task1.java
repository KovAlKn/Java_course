import java.time.LocalTime;
import java.util.Scanner;
public class Sem1Task1 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8"); //неработает!!!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        LocalTime now = LocalTime.now();
        String end="ый";
        String timeOfday;
        int hour = now.getHour();
            if (hour>=5 && hour<12){
            timeOfday="утро";
            end="ое";
        }
        else if(hour>=12 && hour<18){
            timeOfday="день";
        }
        else if(hour>=18 && hour<23){
            timeOfday="вечер";
        }
        else {
            timeOfday="ночи";
            end="ой";
        }
                System.out.printf("Добр%s %s, %s!", end, timeOfday, name);
    }
}
