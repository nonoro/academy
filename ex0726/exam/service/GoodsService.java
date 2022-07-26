package ex0726.exam.service;

/*
    각 요청에 대한 로직(기능)을 담당할 클래스
    (등록, 전체검색, 부분검색, 수정, 삭제 등등...)
*/

import ex0726.exam.domain.Goods;

public class GoodsService {
    public static final int SIZE = 10;
    public static int count; // 0 , 배열방에 저장된 객체의 개수를 체크하는 변수
    // 상품을 관리할 배열을 선언 5개 기본값 10개넘어가면 등록불가

    private Goods[] goodsArr = new Goods[SIZE];
    // 다른곳에서 굿즈서비스를 생성해서 쓰고있기 때문에 따로 또 엔드뷰에서 생성해서 쓰면안돼서 static을 붙이고 public을 붙임

    // 등록하기메서드 (등록실패 - 중복인경우, 배열의길이를 벗어난경우)
    // @return :
    //          0이면 상품코드중복,
    //          1이면 등록성공,
    //          -1이면 배열의 길이를 벗어남
    public int insert(Goods goods) {
        // 배열의 길이 체크
        if (SIZE == GoodsService.count) {
            return -1;
        }

        // 중복 체크
        Goods searchGoods = selectByCode(goods.getCode());
        if (searchGoods != null) { // 찾았다 그러니까 중복이다.
            return 0;
        }

        int saveIndex = 0;
        for (int i = 0; i < goodsArr.length; i++) {
            if (goodsArr[i] == null) {
                saveIndex = i;
                break;
            }
        }

        goodsArr[saveIndex] = goods;
        count++;
        return 1;
    }

    // 전체검색메소드
    public Goods[] selectAll() {
        return goodsArr;
    }


    // 부분검색(상품코드에 해당하는 상품검색) 메소드
    // 조회할 상품코드는? => 코드입력하면 상품이름 가격 설명을 가지고 나감
    // 이때 3개를 리턴해야되는데 이미 Goods에 객체로 만들어놨으니 리턴타입을 Goods로 해야된다.
    // return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
    //          없으면 null 리턴


    // 1 2 3 null 4 null null null ...

    public Goods selectByCode(String code) {
        for (int i = 0; i < SIZE; i++) {
            if (goodsArr[i] != null && goodsArr[i].getCode().equals(code)) {
                return goodsArr[i];
            }
        }

        return null;
    }

    // 수정하기(상품코드에 해당하는 가격, 설명)메서드
    // @return : true 이면 수정완료
    //           false 이면 수정실패
    public boolean update(Goods goods) {
        int goodsIndex = getGoodsIndex(goods.getCode());

        if (goodsIndex == -1) {
            return false;
        }

        goodsArr[goodsIndex] = goods;
        return true;
    }

    // 삭제하기메소드
    public boolean delete(String code) {
        int goodsIndex = getGoodsIndex(code);

        if (goodsIndex == -1) {
            return false;
        }

        goodsArr[goodsIndex] = null;
        count--;
        return true;
    }

    private int getGoodsIndex(String code) {
        for (int i = 0; i < SIZE; i++) {
            if (goodsArr[i].getCode().equals(code)) {
                return i;
            }
        }

        return -1;
    }
}
