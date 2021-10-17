package one.innovation.digital.classes.person;

public class Person {
    private Integer age;
    private Float weight;
    public Person() {
    }
    public Person(final Integer age){
        this.age = age;
    }
    public Person(final Integer age, final Float weight){
        this.age = age;
        this.weight = weight;
    }
    public Integer getAge(){
        return this.age;
    }
    public Float getWeight(){
        return this.weight;
    }
    protected String report(){
        return "Age : $age and Weight : $weight";
    }
}
