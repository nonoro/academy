package test.controller;

import test.model.WeightProfile;
import test.model.dto.RequestWeightProfileDto;
import test.model.dto.ResponseWeightProfileDto;
import test.service.WeightService;
import test.util.Input;
import test.view.InputView;
import test.view.OutputView;

public class WeightController {
    private final WeightService weightService = new WeightService();

    public boolean run() {
        int selectedMenu;

        try {
            selectedMenu = Integer.parseInt(InputView.selectMenu());
        } catch (NumberFormatException e) {
            System.out.println("올바른 메뉴를 선택하세요.\n");
            return true;
        }

        switch (selectedMenu) {
            case 1:
                saveNewProfile();
                break;

            case 2:
                searchProfile();
                break;

            case 3:
                updateWeight();
                break;

            case 4:
                // TODO: 비밀번호 변경 구현
                updatePassword();
                break;

            default:
                return false;
        }

        System.out.println();
        return true;
    }

    private void saveNewProfile() {
        WeightProfile newProfile = InputView.inputProfile();

        weightService.saveProfile(newProfile);
    }

    private void searchProfile() {
        RequestWeightProfileDto request = InputView.inputRequestProfileForSearch();

        try {
            WeightProfile findProfile = weightService.findProfile(request);

            OutputView.showProfileInfo(ResponseWeightProfileDto.from(findProfile));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateWeight() {
        RequestWeightProfileDto request = InputView.inputRequestProfile();

        try {
            WeightProfile findProfile = weightService.findProfile(request);
            OutputView.showUpdateWeightProfileInfo(ResponseWeightProfileDto.from(findProfile));
            String requestWeight = InputView.inputRequestWeight();

            weightService.updateWeight(findProfile, Integer.parseInt(requestWeight));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("몸무게는 숫자로 입력해주세요.\n");
        }
    }

    private void updatePassword() {
        RequestWeightProfileDto request = InputView.inputRequestProfile();

        try {
            WeightProfile findProfile = weightService.findProfile(request);
            OutputView.showUpdatePasswordProfileInfo(ResponseWeightProfileDto.from(findProfile));
            String newPassword = Input.readLine("비밀번호 : ");

            weightService.updatePassword(findProfile, newPassword);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
