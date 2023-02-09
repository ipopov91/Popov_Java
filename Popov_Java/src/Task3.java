
public class Task3 {
    public static void main(String[] args) {
        int[] myList = {11, 19, 32, 8, 15, 91, 51, 49, 0, 99999};

        System.out.println("Вывод элементов массива кратных 3:");
        for(int element : myList) {
            if (element % 3 == 0 && element != 0) {
                System.out.print(element + " ");
            }
        }
    }
}