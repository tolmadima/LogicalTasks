import java.util.Scanner;
public class Task {



    public static int substractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            product = n % 10 * product;
            sum = n % 10 + sum;
            n = n / 10;
        }
        int substract = product - sum;
        return substract;
    }



    public static int countnumbers(int[] mass) {
        int count = 0;

        for (int i = 0; i < mass.length; ++i) {
            int number = mass[i];
            int num_count = 0;
            while (number > 0) {
                number /= 10;
                num_count++;
            }
            if (num_count % 2 == 0)
                ++count;
        }
        return count;
    }


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



    public static String defanIPaddr(String address) {
        String defanIPaddr = address.replace(".", "[.]");
        return defanIPaddr;
    }


    public static void main(String Args[]) {
        int[] massive = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < massive.length; ++i) {
            System.out.println("Введите " + i + " число массива");
            Scanner scanf = new Scanner(System.in);
            int number = scanf.nextInt();
            massive[i] = number;
            System.out.println("Количество чисел с четным количеством цифр " + countnumbers(massive));
        }

        System.out.print("Введите любое целое число : ");
        Scanner scane = new Scanner(System.in);
        int numbers = scane.nextInt();
        System.out.println("Количество шагов равно = " + numberOfSteps(numbers));


        System.out.println("Введите число :")
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        System.out.println("Substract = " + substractProductAndSum(number));



        Scanner scans = new Scanner(System.in);
        String IP = scans.nextLine();
        System.out.println(defanIPaddr(IP));


    }
}
