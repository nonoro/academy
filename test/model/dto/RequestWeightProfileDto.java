package test.model.dto;

public class RequestWeightProfileDto {
    private String name;
    private String password;

    public RequestWeightProfileDto(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
