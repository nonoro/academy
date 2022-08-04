package mvc;
/**
  ������ǰ�� �Ӽ��� �����ϴ� ��ü
    : Value Object = Data Transfer Object
*/
public class Electronics{
    private int modelNo;// ��ǰ��ȣ
	private String modelName; //��ǰ�̸�
	private int modelPrice;//����
	private String modelDetail;//����

	//������ 3��
	public Electronics(){}

	//�����Ҷ� ����� ������
	public Electronics(int modelNo, String modelDetail){
        this.modelNo = modelNo;
		this.modelDetail = modelDetail;
	}

	public Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
       this(modelNo, modelDetail);// �����ڱ����� ù��° �ٿ��� �ٸ� ������ ȣ��

	   this.modelName=modelName;
	   this.modelPrice = modelPrice;
	}

	//set , get �ۼ�
	//setXxx() : public ����void , �μ��ʼ�
  public void setModelNo(int modelNo){
        this.modelNo=modelNo;
  }
  public void setModelName(String modelName){
      this.modelName=modelName;
  }
  public void setModelPrice(int modelPrice){
        this.modelPrice=modelPrice;
  }
  public void setModelDetail(String modelDetail){
      this.modelDetail=modelDetail;
  }


  //getXxx() : public �����ʼ�, �μ�����
  public int getModelNo(){
        return modelNo;
  }
  public String getModelName(){
      return modelName;
  }
  public int getModelPrice(){
        return modelPrice;
  }
  public String getModelDetail(){
      return modelDetail;
  }

@Override
public String toString() {
	
	   
	StringBuilder builder = new StringBuilder();
	builder.append("Electronics [modelNo=");
	builder.append(modelNo);
	builder.append(", modelName=");
	builder.append(modelName);
	builder.append(", modelPrice=");
	builder.append(modelPrice);
	builder.append(", modelDetail=");
	builder.append(modelDetail);
	builder.append("]");
	return builder.toString();
}

    
}