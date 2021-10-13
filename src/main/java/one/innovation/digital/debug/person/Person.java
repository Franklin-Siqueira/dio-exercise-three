package one.innovation.digital.debug.person;

public class Person {
    private String name;
    private Double height;
    private Double weight;

    public Person(final String name, final Double height, final Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
}
