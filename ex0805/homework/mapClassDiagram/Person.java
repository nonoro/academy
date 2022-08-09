package ex0805.homework.mapClassDiagram;

public class Person {
    private String id;
    private String name;
    private int age;

    public Person() {

    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(String id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person : ");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        return sb.toString();
    }
}
