package ex0729.과제.실습.sample02;

public class PartTime extends Employee {
    private int timePay;

    public PartTime() {

    }

    public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
        super(empNo, eName, job, mgr, hiredate, deptName);
        this.timePay = timePay;
    }

    public int getTimePay() {
        return timePay;
    }

    public void setTimePay(int timePay) {
        this.timePay = timePay;
    }

//    @Override
//    public String toString() {
//        return super.toString() + " | " + timePay;
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(timePay);
        return sb.toString();
    }

    @Override
    public void message() {
        System.out.println(super.getEmpName() + "사원은 " + "비정규직입니다.");
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : sample02
*/
