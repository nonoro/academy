package ex0727.수업.exam;

/**
 요청 결과를 출력할 view
 */
public class EndView{
   /**
    성공여부 메시지를 출력하는 메소드
    */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
    전체검색 결과를 출력하는 메소드
    */
   public static void printSelectAll(Goods[] goodsArr){
      System.out.println("*******상품 LIST ("+GoodsService.count+")개 ************");

      // 정보 출력

      for (int i = 0; i < GoodsService.count; i++) {
         System.out.println("상품코드: " + goodsArr[i].getCode() + " | " + "상품이름: " + goodsArr[i].getName()+ " | "
                 + "상품가격: " + goodsArr[i].getPrice()+ " | " + "상품설명: " + goodsArr[i].getExplain());
      }
      System.out.println();
   }

   /**
    상품코드에 해당하는 상세정보 출력하는 메소드
    */
   public static void printSelectByCode(Goods goods){
      System.out.println("******" + goods.getCode() +"의 상세보기 *****");
      System.out.println("상품이름" + goods.getName() +  " | "
                         + "상품가격" + goods.getPrice() + " | "
                          + "상품설명" + goods.getExplain()        );
   }

}