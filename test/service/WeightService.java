package test.service;

import test.model.WeightProfile;
import test.model.dto.RequestWeightProfileDto;

import java.io.*;

public class WeightService {
    private static final String BASE_PATH = "src/test/resources/";
    public static final String DELIMITER = ";";

    public void saveProfile(WeightProfile profile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(BASE_PATH + profile.getName()))) {
            bw.write(profile.getName() + DELIMITER);
            bw.write(profile.getWeight() + DELIMITER);
            bw.write(profile.getPassword());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public WeightProfile findProfile(RequestWeightProfileDto dto) {
        try (BufferedReader br = new BufferedReader(new FileReader(BASE_PATH + dto.getName()))) {
            String[] profileInfo = br.readLine().split(DELIMITER);

            if (!profileInfo[2].equals(dto.getPassword())) {
                throw new IllegalStateException("비밀번호가 일치하지 않습니다.");
            }

            return new WeightProfile(profileInfo[0], Integer.parseInt(profileInfo[1]), profileInfo[2]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateWeight(WeightProfile profile, int requestWeight) {
        profile.setWeight(requestWeight);

        saveProfile(profile);
    }

    public void updatePassword(WeightProfile profile, String newPassword) {
        profile.setPassword(newPassword);

        saveProfile(profile);
    }
}
