package one.innovation.digital.classes.pessoa;

public class PessoaFisicaProgram {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33, 80.7F);
        System.out.println(pessoaFisica.report());
    }
}
