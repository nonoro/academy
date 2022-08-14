package ex0812.homework.mvcWeight.model.service;


import ex0812.homework.mvcWeight.model.dto.WeightProfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WeightService {
    public void inputWeight(WeightProfile weightProfile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            bw.write(weightProfile.getWeight());
            bw.write(";");
            bw.write(weightProfile.getPassword());
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] searchWeight(WeightProfile weightProfile) {
        String[] s = null;
        try (BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            s = br.readLine().split(";");
            if (s[1].equals(weightProfile.getPassword())) {
                return s;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void updateWeight(WeightProfile weightProfile, String weight) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            bw.write(weight);
            bw.write(";");
            bw.write(weightProfile.getPassword());
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePassword(WeightProfile weightProfile, String[] updatePassword,  String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            bw.write(updatePassword[0]);
            bw.write(";");
            bw.write(password);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
