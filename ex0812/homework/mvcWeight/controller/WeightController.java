package ex0812.homework.mvcWeight.controller;

import ex0812.homework.mvcWeight.model.dto.WeightProfile;
import ex0812.homework.mvcWeight.model.service.WeightService;
import ex0812.homework.mvcWeight.model.util.Input;
import ex0812.homework.mvcWeight.view.InputView;
import ex0812.homework.mvcWeight.view.MainView;
import ex0812.homework.mvcWeight.view.OutputView;

import java.io.IOException;

public class WeightController {
    WeightService service = new WeightService();

    public void run() throws IOException {
        boolean run = true;
        while (run) {
            MainView.showMenu();
            switch (Integer.parseInt(Input.readLine())) {
                case 1:
                    WeightProfile inputProfile = InputView.inputWeight(); // 이름, 몸무게, 비밀번호가 저장된 WeightProfile객체 받아옴
                    service.inputWeight(inputProfile);
                    break;
                case 2:
                    WeightProfile searchProfile = InputView.searchWeight(); // 이름, 비밀번호가 저장된 WeightProfile객체 받아옴
                    String[] searchWeight = service.searchWeight(searchProfile); // 잘못된 비밀번호를 입력하면 searchWeight가 null
                    if (searchWeight != null) {
                        OutputView.printProfile(searchProfile, searchWeight[0]);
                        break;
                    }
                    OutputView.printPasswordError();
                    break;
                case 3:
                    WeightProfile updateSearchProfile = InputView.searchWeight(); // 이름, 비밀번호가 저장된 WeightProfile객체 받아옴
                    String[] weight = service.searchWeight(updateSearchProfile);
                    if (weight != null) {
                        OutputView.printProfile(updateSearchProfile, weight[0]);
                    } else {
                        OutputView.printPasswordError();
                        break;
                    }
                    String updateWeight = InputView.updateWeight();
                    service.updateWeight(updateSearchProfile, updateWeight);
                    break;
                case 4:
                    WeightProfile updateProfile = InputView.searchWeight(); // 이름, 비밀번호가 저장된 WeightProfile객체 받아옴
                    String[] updatePassword = service.searchWeight(updateProfile); // 잘못된 비밀번호를 입력하면 searchWeight가 null
                    if (updatePassword != null) {
                        OutputView.printPassword(updateProfile, updatePassword[1]);
                    } else {
                        OutputView.printPasswordError();
                        break;
                    }
                    String password = InputView.updatePassword();
                    service.updatePassword(updateProfile, updatePassword, password);
                    break;

                case 5:

                default:
                    OutputView.printEndMessage();
                    run = false;
            }

        }
    }
}
