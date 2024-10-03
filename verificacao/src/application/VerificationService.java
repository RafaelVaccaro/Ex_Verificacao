package application;

import java.util.Objects;

public class VerificationService {

    public static <T extends Usuario> boolean verify(T usuario, String password) {
        if(usuario instanceof Funcionario) {
            // Como verificar o funcionário
            usuario.verificarIdentidade(((Funcionario) usuario).matricula, password);
        } else if(usuario instanceof Cliente) {
            // Como verificar o cliente
            usuario.verificarIdentidade(usuario.cpf, password);
        }
        return true;
    }
}
