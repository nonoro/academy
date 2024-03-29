package test.model.dto;

import test.model.WeightProfile;

public class ResponseWeightProfileDto {
    private String name;
    private int weight;

    public ResponseWeightProfileDto(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public static ResponseWeightProfileDto from(WeightProfile findProfile) {
        return new ResponseWeightProfileDto(findProfile.getName(), findProfile.getWeight());
    }
}
