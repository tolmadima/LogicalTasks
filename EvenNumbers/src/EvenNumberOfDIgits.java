import java.util.Scanner;
class EvenNumberOfDIgits {
    public static int[] NewArray;
    public static int j;
    public static int findNumbers(int nums) {
        j = nums;
        for (int i=1; i<nums; i++ ){
            NewArray = new int[nums];
            System.out.println("Введите число номер " + i);
            Scanner scanf = new Scanner(System.in);
            int number = scanf.nextInt();
            NewArray[i] = number;
            System.out.println(+ NewArray[i]);
        }
        return 0;
    }

    public static int EvenNumber(int Number){
        for (int i=1; i<j; i++) {
            int a = NewArray[i];

        }
    }

    public static void main(String Args[]){
        System.out.println("Введите количество значений массива");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        findNumbers(number);

    }
}
