package ex0812.homework.mvcWeight.model.dto;

public class WeightProfile {
    private String name;
    private String weight;
    private String password;
    private int identityNumber;

    public WeightProfile() {

    }

    public WeightProfile(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public WeightProfile(String name, int identityNumber) {
        this.name = name;
        this.identityNumber = identityNumber;
    }


    public WeightProfile(String name, String weight, String password, int identityNumber) {
        this(name, password);
        this.weight = weight;
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }
}
