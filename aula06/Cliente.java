public class Cliente {
    //atributos
    String nome;
    String email;
    private int idade;

    public void setIdade(int idade) {
        if(idade > 0 && idade < 120) {
            this.idade = idade;
        }
    }
 
    public void exibirDados() {
        System.out.println("Cliente: " + nome + " - " + email + " - " + idade);
    }

}
