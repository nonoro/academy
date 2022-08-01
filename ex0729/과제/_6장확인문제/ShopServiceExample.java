package ex0729.과제._6장확인문제;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제18
*/
