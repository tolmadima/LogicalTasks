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
            DecreasingToZero.numberOfSteps(19);
            System.out.println("Количество шагов равно = " + DecreasingToZero.numberOfSteps(19));
        }
}
