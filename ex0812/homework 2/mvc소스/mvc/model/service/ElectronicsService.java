package ex0812.homework.mvc소스.mvc.model.service;


import ex0812.homework.mvc소스.mvc.model.dto.Electronics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * 전자제품에 관련된 기능을 담당할 클래스  - 싱글톤 클래스
 */
public class ElectronicsService {
    public void inputFirstData() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            List<Electronics> list = new ArrayList<>();
            list.add(new Electronics(100, "선풍기", 35000, "삼성 선풍기"));
            list.add(new Electronics(200, "전자렌지", 55000, "잘 데워져요.."));
            list.add(new Electronics(300, "에어컨", 5500000, "무풍 에어컨 너무 시원해"));
            list.add(new Electronics(400, "냉장고", 800000, "LG 냉장고"));
            list.add(new Electronics(500, "드라이기", 9000, "LG 드라이기"));

            for (Electronics electronics : list) {
                bw.write(String.valueOf(electronics));
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<String> selectAll() {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            while (true) {
                String s = br.readLine();
                if (s == null) {
                    break;
                }
                list.add(s);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String inputSearch(int number) {
        try (BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            while (true) {
                String s = br.readLine();
                String[] modelNo = s.split(",");
                if (Integer.valueOf(modelNo[0]).equals(number)) {
                    return s;
                }
            }
        } catch (Exception e) {

        }
        return null;
    }

    public String inputInsert(Electronics modelInformation) {
        String s = inputSearch(modelInformation.getModelNo());
        if (s == null) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt", true))) {
                bw.write(String.valueOf(modelInformation));
                bw.newLine();
                bw.flush();
                return null;
            } catch (Exception e) {
            }
        }
        return String.valueOf(modelInformation.getModelNo());
    }

    public String inputUpdate(Electronics modelDetail) {
        String s2 = inputSearch(modelDetail.getModelNo());
        boolean run = true;
        List<Electronics> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            while (run) {
                String s1 = br.readLine();
                String[] s = s1.split(",");
                if (s1 == null) {
                    run = false;
                }
                list.add(new Electronics(Integer.valueOf(s[0]), s[1], Integer.valueOf(s[2]), s[3]));
            }
        } catch (Exception e) {
        }

        for (Electronics electronics : list) {
            if (electronics.getModelNo() == modelDetail.getModelNo()) {
                electronics.setModelDetail(modelDetail.getModelDetail());
            }
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            for (Electronics electronics : list) {
                bw.write(String.valueOf(electronics));
                bw.newLine();
            }
        } catch (
                Exception exception) {
        }

        return s2;
    }

    public String inputDelete(int number) {
        String s2 = inputSearch(number);
        boolean run = true;
        List<Electronics> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            while (run) {
                String s1 = br.readLine();
                String[] s = s1.split(",");
                if (s1 == null) {
                    run = false;
                }
                if (s[0].equals(String.valueOf(number))) {
                    continue;
                }
                list.add(new Electronics(Integer.valueOf(s[0]), s[1], Integer.valueOf(s[2]), s[3]));
            }
        } catch (Exception e) {
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/homework/mvc소스/전자제품목록/전자제품목록.txt"))) {
            for (Electronics electronics : list) {
                bw.write(String.valueOf(electronics));
                bw.newLine();
            }
        } catch (Exception exception) {
        }

        return s2;
    }
}



