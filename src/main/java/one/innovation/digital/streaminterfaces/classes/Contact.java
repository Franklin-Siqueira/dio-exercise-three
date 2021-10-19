package one.innovation.digital.streaminterfaces.classes;

public class Contact {
    // public Integer id; // * id = 1 - Contato = nome: Simba, numero: 2222;
    public String name; // * id = 4 - Contato = nome: Cami, numero: 5555;
    public Integer number; // * id = 3 - Contato = nome: Jon, numero: 1111;

    public Contact(String name, Integer number) {
        // this.id = id;
        this.name = name;
        this.number = number;
    }
//    public Integer getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "name =" + name +
                ", number ='" + number + '\'';
    }
//    @Override
//    public String toString() {
//        return "id ='" + id + '\'' +
//                ", name =" + name +
//                ", number ='" + number + '\'';
//    }
}