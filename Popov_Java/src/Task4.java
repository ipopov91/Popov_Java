import java.util.Scanner;

public class Task4
{
    public static boolean check(String brackets) {
        int len_a, len_b;
        String template = brackets.replaceAll("[^()\\[\\]{}]","");

        do {
            len_a = template.length();
            template = template.replaceAll("\\(\\)", "");
            template = template.replaceAll("\\[]", "");
            template = template.replaceAll("\\{}", "");
            len_b = template.length();
        } while (len_a != len_b);
        return (len_b == 0);
    }

    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Введите последовательность скобок:");

        String name = myObj.nextLine();
        System.out.println("Последовательность скобок является правильной - " + check(name));

    }
}