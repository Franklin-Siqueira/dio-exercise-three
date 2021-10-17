package one.innovation.digital.classes.person;

import one.innovation.digital.classes.user.SuperUser;

public class UserApp {
    public static void main(String[] args) {
        final var quackMan = new SuperUser("QuackMan", "1234");

        quackMan.getLogin();
        // quackMan.getPassword(); // Error: protected access

        // String clientName = quackMan.name; // Error: not public
    }
}
