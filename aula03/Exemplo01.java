import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // 1. inicilização
        // 2. ponto de parada
        // 3. passo ou incremento

        int cont = 1;
        while (cont < 5 ) {
            System.out.print(cont + " ");
            cont++; // cont = cont + 2;
        }
        
        System.out.println("\n---------");
        
        for (int i = 1; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n---------");

        for (int i = 5; i > 0 ; i--) {
            System.out.print(i + " ");
        }
        
        Scanner entrada = new Scanner(System.in);
        String palavra="";
        while (!palavra.equalsIgnoreCase("sair")) {
            System.out.println("Digite a palavra:");
            palavra = entrada.nextLine();
            System.out.println("essa palavra tem " + palavra.length() + " caracteres");
        }
        entrada.close();

    }
}
