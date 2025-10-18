public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marcos", "marcos@email.com", 34);
        Cliente cliente2 = new Cliente();

        System.out.println(cliente2.exibirDados());
        
        String dadosCliente = cliente.exibirDados();
        cliente.setIdade(43);

        System.out.println(dadosCliente);

        System.out.println("Idade = " + cliente.getIdade());
    }
}
