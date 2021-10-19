package one.innovation.digital.collections.maporderingclasses;

import java.util.Objects;
/**
 *  ExerciseThree
 */
public class Contact {
    private final String name;
    private final Integer number;

    public Contact(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contato = (Contact) o;
        return name.equals(contato.name) && number.equals(contato.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
