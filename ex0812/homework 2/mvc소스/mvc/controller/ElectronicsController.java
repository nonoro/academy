package ex0812.homework.mvc소스.mvc.controller;
/*
    View와 Model 사이에서 중간 역할
     : 사용자의 요청을 받아서 그애 해당하는 서비스를 호출하고
       호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 */


import ex0812.homework.mvc소스.mvc.model.dto.Electronics;
import ex0812.homework.mvc소스.mvc.model.service.ElectronicsService;
import ex0812.homework.mvc소스.mvc.model.util.InputNumber;
import ex0812.homework.mvc소스.mvc.view.InputView;
import ex0812.homework.mvc소스.mvc.view.OutputView;
import ex0812.homework.mvc소스.mvc.view.MenuView;

import java.util.List;

public class ElectronicsController {
    public void run() {

        boolean run = true;
        ElectronicsService service = new ElectronicsService();
        System.out.println("-----------프로그램 시작합니다. -----------------");
//        service.inputFirstData();
        while (run) {
            MenuView.printMenu();
            switch (InputNumber.readLine()) {
                case "1":
                    List<String> strings = service.selectAll();
                    OutputView.printAll(strings);
                    break;
                case "2":
                    String modelNo = InputView.inputSearchModelNo();
                    String number = service.inputSearch(Integer.valueOf(modelNo));
                    OutputView.printSearchModelNo(number);
                    break;
                case "3":
                    Electronics modelInformation = InputView.InputNewModel();
                    String s = service.inputInsert(modelInformation);
                    OutputView.registrationInformation(s);
                    break;
                case "4":
                    List<String> str = service.selectAll();
                    OutputView.printAll(str);
                    Electronics modelDetail = InputView.updateModelinforMation();
                    String updateResult = service.inputUpdate(modelDetail);
                    OutputView.printUpdateResult(updateResult);
                    break;
                case "5":
                    int i = InputView.inputDeleteModelNo();
                    String deleteResult = service.inputDelete(i);
                    OutputView.printDeleteResult(deleteResult);
                    break;
                case "9":
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요!!!!");

            }
        }//switch문끝
    }

}
