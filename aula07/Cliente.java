public class Cliente {
    //atributos
    String nome;
    String email;
    private int idade;

    // sobrecarga = overload

    public Cliente() {
        this.nome = "sem cadastro";
        this.email = "sem email";
    }

    public Cliente(String nome, String email, int idade) { 
        this.nome = nome;
        this.email = email;

        setIdade(idade);
    }

    // outro exemplo de sobrecarga
    public void setIdade(int idade) {
        if(idade > 0 && idade < 120) {
            this.idade = idade;
        }
    }
    public void setIdade() {
        this.idade = 0;
    }

    public int getIdade() {
        return idade;
    }
  
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String exibirDados() {
        return "Cliente: " + nome + " - " + email + " - " + idade;
    }

}
