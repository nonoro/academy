package ex0726.exam.view;

import ex0726.exam.domain.Goods;
import ex0726.exam.service.GoodsService;

import java.util.Scanner;

public class MenuView {
    private static final int SAVE = 1;
    private static final int SEARCH_ALL = 2;
    private static final int SEARCH_BY_CODE = 3;
    private static final int UPDATE = 4;
    private static final int DELETE = 5;
    private static final int EXIT = 9;
    private static final Scanner SCANNER = new Scanner(System.in);;

    private GoodsService service = new GoodsService();


    public void printMenu() {
        while(true) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. 등록  2. 전체검색  3. 상품코드검색  4. 수정하기  9. 종료");
            System.out.println("----------------------------------------------------------------");
            System.out.print("메뉴 선택 > ");
            int menuChoice = Integer.parseInt(SCANNER.nextLine());
            switch (menuChoice) {
                case 1:
                    inputInsert();
                    break;
                case 2:
                    Goods[] goodsArr = service.selectAll();
                    EndView.printSelectAll(goodsArr);
                    break;
                case 3:
                    inputSelectByCode();
                    break;
                case 4:
                    inputUpdate();
                    break;
                case 5:
                    inputDelete();
                    break;
                case 6:
                case 7:
                case 8:
                default:
                    System.out.println("메뉴는 1~4 or 9만 입력해주세요. ");
                    break;
                case 9:
                    System.out.println("다음에 또 이용해 주세요. 프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }


    public void inputInsert() {
        System.out.print("상품코드 > ");
        String code = SCANNER.nextLine();
        System.out.print("상품이름 > ");
        String name = SCANNER.nextLine();
        System.out.print("상품가격 > ");
        int price = Integer.parseInt(SCANNER.nextLine());
        System.out.print("상품설명 > ");
        String explain = SCANNER.nextLine();
        Goods goods = this.createGoods(code, name, price, explain);
        int result = this.service.insert(goods);
        if (result == -1) {
            EndView.printMessage("더 이상 등록할 수 없습니다.");
        } else if (result == 0) {
            EndView.printMessage(code + "는 중복이므로 등록할 수 없습니다");
        } else {
            EndView.printMessage("상품이 등록되었습니다.");
        }

    }

    private Goods createGoods(String code, String name, int price, String explain) {
        Goods goods = new Goods();
        goods.setCode(code);
        goods.setName(name);
        goods.setPrice(price);
        goods.setExplain(explain);
        return goods;
    }

    public void inputSelectByCode() {
        String code = this.inputCode();
        Goods findGoods = this.service.selectByCode(code);
        if (findGoods == null) {
            EndView.printMessage("상품 정보가 없습니다.");
        } else {
            EndView.printSelectByCode(findGoods);
        }
    }

    public void inputUpdate() {
        System.out.print("수정할 상품의 코드를 입력하세요 > ");
        String code = SCANNER.nextLine();
        Goods findGoods = service.selectByCode(code);
        EndView.printSelectByCode(findGoods);
        System.out.print("상품이름 > ");
        String name = SCANNER.nextLine();
        System.out.print("상품가격 > ");
        int price = Integer.parseInt(SCANNER.nextLine());
        System.out.print("상품설명 > ");
        String explain = SCANNER.nextLine();
        Goods newGoods = createGoods(code, name, price, explain);
        if (!service.update(newGoods)) {
            EndView.printMessage("수정할 상품의 코드가 없습니다.");
        } else {
            EndView.printMessage("수정이 완료되었습니다.");
        }
    }

    private void inputDelete() {
        System.out.print("삭제할 상품의 코드를 입력하세요 > ");
        String code = SCANNER.nextLine();
        if (!service.delete(code)) {
            EndView.printMessage("삭제할 상품의 코드가 없습니다.");
        } else {
            EndView.printMessage("삭제가 완료되었습니다.");
        }
    }


    private String inputCode() {
        System.out.print("입력 > ");
        return SCANNER.nextLine();
    }
}

