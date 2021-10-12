package one.innovation.digital.classes.pessoa;

public class Pessoa {
    private Integer age;
    private Float weight;
    public Pessoa() {
    }
    public Pessoa(final Integer age){
        this.age = age;
    }
    public Pessoa(final Integer age, final Float weight){
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
