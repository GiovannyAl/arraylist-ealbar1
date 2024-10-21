public class PersonBonus {
    private String name;
    private int age;

    public PersonBonus(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "PersonBonus{Nombre='" + name + "', Edad=" + age + "}";
    }
}
