package one.innovation.digital.types.primitive;

public class DefaultValues {
    public static void main(String[] args) {
        final Default d = new Default();
        System.out.println(d.getI());
        System.out.println(d.isActive());
    }
}

class Default {
    int I;
    boolean active;

    public int getI() {
        return I;
    }
    public boolean isActive() {
        return active;
    }
}
