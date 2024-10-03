package application;

public class Main {
    public static void main(String[] args) {

        Funcionario rafael = new Funcionario("Rafael", "04240585023", 618254, "Rafa240904*");
        Cliente lucas = new Cliente("Lucas", "0423102301", "123456789");

        rafael.verificarIdentidade("04240585023", "Rafa240904*");
        rafael.verificarIdentidade(618254, "Rafa240904*");
        lucas.verificarIdentidade("1122334455", "123456789");

        VerificationService.verify(rafael, "Rafa240904");
        VerificationService.verify(lucas, "123456789");
    }
}