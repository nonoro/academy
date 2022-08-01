package ex0729.과제.실습.sample02;

public class FullTime extends Employee {
    private int salary;
    private int bonus;

    public FullTime() {
    }

    public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
        super(empNo, eName, job, mgr, hiredate, deptName);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + salary + " | " + bonus;
    }

    @Override
    public void message() {
        System.out.println(super.geteName() + "사원은 " + "정규직입니다.");
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : sample02
*/