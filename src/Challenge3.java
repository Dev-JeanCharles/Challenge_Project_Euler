public class Challenge3 {
    public static void main(String[] args) {

        //13195
        //600851475143
        long number = 600851475143L;
        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                number /= divisor;
            }
            else {
                divisor++;
            }
            System.out.println(divisor);

        }
        }
    }
