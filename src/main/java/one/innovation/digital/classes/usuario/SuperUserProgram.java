package one.innovation.digital.classes.usuario;

public class SuperUserProgram {
    public static void main(String[] args){
        final var superUser = new SuperUsuario("root", "1234");
        superUser.getLogin();
        superUser.getPassword();
        String root = superUser.name;
    }
}
