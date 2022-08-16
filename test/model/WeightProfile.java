package test.model;

public class WeightProfile {
    private String name;
    private int weight;
    private String password;

    public WeightProfile(String name, int weight, String password) {
        this.name = name;
        this.weight = weight;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getPassword() {
        return password;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
