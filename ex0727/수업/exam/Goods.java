package ex0727.수업.exam;


public class Goods{
	private String code;  // 상품코드 null
	private String name;  // 상품이름 null
	private int price;    // 상품가격 0
	private String explain; // 상품설명 null

	//setXxx
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

	//getXxx
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


}