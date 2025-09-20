import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        numero = -1;
        while (numero < 0) {
            System.out.println("Digite um valor positivo:");
            numero = scanner.nextInt();
        }

        do {
            System.out.println("Digite um valor positivo:");
            numero = scanner.nextInt();
        } while (numero < 0);

        scanner.close();

    }
}
