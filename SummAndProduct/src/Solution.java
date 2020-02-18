public class Solution {
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
    public static void main(String Args[]){
        System.out.println("Substract = " + Solution.substractProductAndSum(1234));
    }
}
