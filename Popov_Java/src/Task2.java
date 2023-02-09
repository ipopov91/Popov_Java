import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        String greetingName = "Вячеслав";

        Scanner myObj = new Scanner(System.in);

        System.out.println("Введите имя:");

        String name = myObj.nextLine();

        if (name.equals(greetingName)) {
            System.out.println("Привет, " + greetingName);
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}