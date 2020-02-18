import java.util.Scanner;
public class DecreasingToZero {
        public static int numberOfSteps(int num) {
            int step = 0;
            while (num != 0)
            {
                if ((num % 2) == 0)
                {
                    num = num / 2;
                }
                else
                {
                    num = num - 1;
                }
                step++;
            }

            return step;
        }
        public static void main(String[] args) {
            System.out.print("Введите любое целое число : ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            System.out.println("Количество шагов равно = " + DecreasingToZero.numberOfSteps(number));
        }
}
