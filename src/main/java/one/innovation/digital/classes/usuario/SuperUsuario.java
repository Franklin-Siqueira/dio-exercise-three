package one.innovation.digital.classes.usuario;

public class SuperUsuario {
    private String login;
    private String password;
    String name;

    public SuperUsuario(final String login, final String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    protected String getPassword() {
        return password;
    }
}
