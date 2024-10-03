package application;

public class Cliente extends Usuario {

    public Cliente(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }

    @Override
    public void verificarIdentidade(Object id, String senha) {
        if (id instanceof String && this.cpf.equals(id)) {
            System.out.println("CPF do cliente verificado.");
        } else {
            System.out.println("CPF do cliente não corresponde.");
        }
    }
}

