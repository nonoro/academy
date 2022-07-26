package ex0726.exam.view;
/*
리턴 결과를 출력할 View
*/

import ex0726.exam.domain.Goods;
import ex0726.exam.service.GoodsService;

public class EndView {
    /*
        성공여부 메시지를 출력하는 메소드
     */
    public static void printMessage(String message) {
        System.out.println(message + "\n");
    }

    /*
        전체검색 결과를 출력하는 메소드
     */
    public static void printSelectAll(Goods[] goodsArr) {
        System.out.println("********상품 LIST("+ GoodsService.count +"개)*************");
        for (int i = 0; i < goodsArr.length; i++) {
            if (goodsArr[i] != null) {
                System.out.println(goodsArr[i]);
            }
        }
    }

    /*
        상품코드에 해당하는 상세정보 출력하는 메소드
     */
    public static void printSelectByCode(Goods goods) {
        System.out.println("**********" + goods.getCode() + "의 상세보기 **********" );
        System.out.println(goods);
    }

    public static void printUpdateResult(boolean updateStatus) {
        if (!updateStatus) {
            printMessage("수정할 상품의 코드가 없습니다.");
            return;
        }

        printMessage("수정이 완료되었습니다.");
    }

}
