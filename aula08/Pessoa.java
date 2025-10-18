public class Pessoa extends Object {
    private String nome;
    private String email;

    public Pessoa() {
        this.nome = "sem cadastro";
        this.email = "sem email";
    }

    public Pessoa(String nome, String email) { 
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String exibirDados() {
        return nome + " - " + email;
    }

}
