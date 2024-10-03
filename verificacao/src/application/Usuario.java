package application;

public abstract class Usuario implements Verificacao {
    protected String nome;
    protected String cpf;
    protected String senha;

    public Usuario(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }


}
