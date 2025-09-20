public class Exemplo02 {
    public static void main(String[] args) {
        // int vet[] = new int[5];
        int vetor[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posição "+ i + " valor " + vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == 20){
                System.out.println("Achei o 20 na posição " + i);
            }
        }

        System.out.println("--------");

        for (int item : vetor) {
            System.out.println(item);
        }
    }
}
