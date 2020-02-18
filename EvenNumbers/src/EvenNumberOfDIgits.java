import java.util.Scanner;
public class EvenNumberOfDIgits {
    public static int findNumbers(int[] nums) {
        for (int i=0; i>number; i = i++;){
            System.out.println("Введите число номер " + i);
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            findNumbers(i) = number;
            System.out.println(+ findNumbers(i));
        }
        return findNumbers();
    }
    public static void main(String Args[]){
        System.out.println("Введите количество чисел в ряду");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        findNumbers(number);
    }
}
