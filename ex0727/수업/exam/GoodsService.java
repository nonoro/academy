package ex0727.수업.exam;

import java.util.Locale;

/**
 * 각 요청에 대한 로직(기능)을 담당할 클래스
 * (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
 */
public class GoodsService {

    //상품을 관리할 배열 선언
    private Goods[] goodsArr = new Goods[10];
    public static int count;//0 배열방에 저장 객체의 개수

    /*
        초기치 데이터를 세팅하는 메소드
     */
    public void init(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            goodsArr[count++] = create(data[i]);
        }
    }

    /*
        Goods를 생성해서 값을 설정하고 생성된 Goods를 리턴하는 메소드
     */
    private Goods create(String[] data) {
        Goods goods = new Goods();
        goods.setCode(data[0]);
        goods.setName(data[1]);
        goods.setPrice(Integer.parseInt(data[2]));
        goods.setExplain(data[3]);

        return goods;
    }


    /**
     * 등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
     *
     * @return :
     * 0이면 상품코드 중복 ,
     * 1이면 등록성공,
     * -1이면 배열의 길이 벗어남
     */
    public int insert(Goods goods) {

        // 배열의 길이 체크
        if (goodsArr.length == GoodsService.count) {
            return -1;
        }

        //중복체크
        Goods searchGoods = this.selectByCode(goods.getCode());
        if (searchGoods != null) { //찾았다 그러니까 중복이다.
            return 0;
        }

        goodsArr[GoodsService.count++] = goods;
        return 1;
    }


    /**
     * 전체검색
     */
    public Goods[] selectAll() {

        return goodsArr;
    }

    /**
     * 상품코드에 해당하는 상품 검색
     *
     * @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
     * 없으면 null 리턴
     */
    public Goods selectByCode(String code) {
        for (int i = 0; i < GoodsService.count; i++) {
            Goods goods = goodsArr[i];      //  배열방이 있는 주소값
            if (goods.getCode().toUpperCase().equals(code.toUpperCase())) {
                return goodsArr[i];
            }
        }
        return null;
    }


    /*
      상품코드에 해당하는 가격, 설명 수정하기

      @return : true이면 수정완료, false이면 수정실패
     */
    public boolean update(Goods goods) {
        Goods searchGoods = selectByCode(goods.getCode());
        if (searchGoods != null) {
            // 수정하자
            searchGoods.setPrice(goods.getPrice());
            searchGoods.setExplain(goods.getExplain());
            return true;
        } else {
            return false;
        }
    }
}