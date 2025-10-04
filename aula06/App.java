public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.nome = "Marcos";
        cliente.email = "marcos@email.com";
        
        cliente.setIdade(34);

        cliente.exibirDados();
    }
}
