package ex0728.수업.MVC;

public class Electronics {

    private int modelNo;        // 상품번호
    private String modelName;   // 상품이름
    private int modelPrice;     // 가격
    private String modelDetail; // 상품설명

    // 생성자 3개
    public Electronics() {
    }

    // 수정할때 사용할 생성자
    public Electronics(int modelNo, String modelDetail) {
        this.modelNo = modelNo;
        this.modelDetail = modelDetail;
    }

    public Electronics(int modelNo, String modelName, int modelPrice, String modelDetail) {
        this(modelNo, modelDetail); // 생성자 구현부 첫번째 줄에서 다른 생성자 호출
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    // set, get 작성
    // setXxx() : public 리턴void, 인수필수
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelPrice(int modelPrice) {
        this.modelPrice = modelPrice;
    }

    public void setModelDetail(String modelDetail) {
        this.modelDetail = modelDetail;
    }

    // getXxx() : public 리턴있음, 인수없
    public int getModelNo() {
        return modelNo;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelPrice() {
        return modelPrice;
    }

    public String getModelDetail() {
        return modelDetail;
    }


    public String toString() {
        return "[Electromnics]\n" + " modelNo: " + modelNo + " modelName: " + modelName
                + " modelPrice: " + modelPrice + " modelDetail: " + modelDetail;
    }
}
