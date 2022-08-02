package ex0729.과제.실습.sample02;

public abstract class Employee {
    private int empNo;
    private String empName;
    private String job;
    private int mgr;
    private String hiredate;
    private String deptName;

    public Employee() {

    }

    public Employee(int empNo, String empName, String job, int mgr, String hiredate, String deptName) {
        this.empNo = empNo;
        this.empName = empName;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.deptName = deptName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

//    @Override
//    public String toString() {
//        return empNo + " | "
//                + empName + " | "
//                + job + " | "
//                + mgr + " | "
//                + hiredate + " | "
//                + deptName;
//    }


    @Override
    public String toString() { // 싱글쓰레드라 toString() 빌더사용
        final StringBuilder sb = new StringBuilder();
        sb.append(empNo).append(" | ");
        sb.append(empName).append(" | ");
        sb.append(job).append(" | ");
        sb.append(mgr);
        sb.append(hiredate).append(" | ");
        sb.append(deptName).append(" | ");
        return sb.toString();
    }

    public abstract void message(); // 만약 추상클래스가 아닐때도 얘를 쓰는데 아무내용이 없는 message메소드를 부모에게 쓰는이유는
                                    // 부모타입으로 자손객체를 선언할때 부모에 없는 메소드를 쓰려면 형변환을 해야하는데 이렇게하면
                                    // 자동으로 자손이 오버라이드한 메소드로 실행이되기 때문에 호출하기 편해서 이렇게 한다!
}


/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : sample02
*/