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
            bw.write(";");
            bw.write(String.valueOf(weightProfile.getIdentityNumber()));
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
        String[] split = null;
        try(BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            split = br.readLine().split(";");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            bw.write(weight);
            bw.write(";");
            bw.write(weightProfile.getPassword());
            bw.write(";");
            bw.write(split[2]);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePassword(WeightProfile weightProfile, String weight, String password) {
        String[] split = null;
        try(BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            split = br.readLine().split(";");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvcWeight/" + weightProfile.getName() + ".txt"))) {
            bw.write(weight);
            bw.write(";");
            bw.write(password);
            bw.write(";");
            bw.write(split[2]);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] searchPassword(WeightProfile searchPassword) {
        try(BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvcWeight/" + searchPassword.getName() + ".txt"))) {
            String[] s = br.readLine().split(";");
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
