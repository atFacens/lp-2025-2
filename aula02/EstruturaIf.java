public class EstruturaIf {
    public static void main(String[] args) {
        int idade = 19;

        String resultado = verificaMaioridade(idade);

        System.out.println(resultado);
    }

    static String verificaMaioridade(int idade) {
        // if (idade >= 18) {
        //     return "Você é maior de idade";
        // } else {
        //     return "Você é menor de idade";
        // }

        // (if) operador ternário 
        return (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
    }

}
