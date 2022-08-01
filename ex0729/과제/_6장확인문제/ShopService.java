package ex0729.과제._6장확인문제;

//  Exam18

public class ShopService {

    private static ShopService shopService = new ShopService();

    private ShopService() {

    }

    public static ShopService getInstance() {
        return shopService;
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제18
*/
