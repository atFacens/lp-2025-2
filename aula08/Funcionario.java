public class Funcionario extends Pessoa {

    public Funcionario(String nome, String email) {
        super(nome, email);
    }
    
    @Override
    public String exibirDados() {
        return "Funcionario: " + super.exibirDados();
    }
    
    @Override
    public String toString() {
        return getClass() + ": "+super.exibirDados();
    }
    
}
