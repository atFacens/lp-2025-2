import java.util.ArrayList;
import java.util.List;

public class Exemplo03 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(11);
        lista.add(20);
        lista.add(31);
        lista.add(40);
        lista.add(51);

        for (Integer valor : lista) {
            if (valor % 2 == 0) {
                System.out.println(valor);
            }
        }

    }
}
