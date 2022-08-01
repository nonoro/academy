package ex0729.과제.실습.sample02;

public abstract class Employee {
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hiredate;
    private String deptName;

    public Employee() {

    }

    public Employee(int empNo, String eName, String job, int mgr, String hiredate, String deptName) {
        this.empNo = empNo;
        this.eName = eName;
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

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
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

    @Override
    public String toString() {
        return empNo + " | "
                + eName + " | "
                + job + " | "
                + mgr + " | "
                + hiredate + " | "
                + deptName;
    }

    public abstract void message();

}


/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : sample02
*/