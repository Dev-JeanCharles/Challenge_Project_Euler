//Challenge 1 - Multiples of 3 or 5
public class Challenge1 {
    public static void main(String[] args) {
        int somaNumeros = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3) == 0 || i % 5 == 0) {
                System.out.println(i);
                somaNumeros += i;
            }
        }
        System.out.println("A soma dos múltiplos é: "+ somaNumeros);
    }
}