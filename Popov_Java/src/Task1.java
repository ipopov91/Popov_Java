import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int minNumberForGreeting = 8;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = myObj.nextInt();

        if (number >= minNumberForGreeting) {
            System.out.println("Привет");
        }
    }
}