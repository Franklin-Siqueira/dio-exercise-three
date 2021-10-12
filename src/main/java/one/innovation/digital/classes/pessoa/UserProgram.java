package one.innovation.digital.classes.pessoa;

import one.innovation.digital.classes.usuario.SuperUsuario;

public class UserProgram {
    public static void main(String[] args) {
        final var quackMan = new SuperUsuario("QuackMan", "1234");

        quackMan.getLogin();
        // quackMan.getPassword(); // Error: protected access

        // String clientName = quackMan.name; // Error: not public
    }
}
