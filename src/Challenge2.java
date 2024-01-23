public class Challenge2 {
    public static void main(String[] args) {
        int numeroAtual = 1;
        int proximoNumero = 2;
        int somaPares = 0;
        while (numeroAtual < 4000000) {
            if (numeroAtual % 2 == 0) {
                somaPares+=numeroAtual;
            }
            int fibonacci = numeroAtual + proximoNumero;
            numeroAtual = proximoNumero;
            proximoNumero = fibonacci;
            System.out.println(fibonacci);
        }
        System.out.println("A soma dos pares é: "+ somaPares);
    }
}
