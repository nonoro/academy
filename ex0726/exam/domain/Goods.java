package ex0726.exam.domain;
/*
    상품으로 속성을 관리하는 개체
*/

public class Goods {
    // 4개의 속성을 관리
    // 겟터 셋터 메소드 관리
    private String code;  // 상품코드
    private String name;  // 상품이름
    private int price;    // 가격
    private String explain;  // 상품설명


    // setXxx
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    // getXxx
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", explain='" + explain + '\'' +
                '}';
    }
}
