package application;

public class Funcionario extends Usuario {

    protected Integer matricula;

    public Funcionario(String nome, String cpf, Integer matricula, String senha) {
        super(nome, cpf, senha);
        this.matricula = matricula;
    }

    @Override
    public void verificarIdentidade(Object id, String senha) {
        if (id instanceof String && this.cpf.equals(id)) {
            System.out.println("CPF do funcionário verificado.");
        } else if (id instanceof Integer && this.matricula.equals(id)) {
            System.out.println("Matricula do funcionário verificada.");
        } else {
            System.out.println("Identidade do funcionário não corresponde.");
        }
    }
}
