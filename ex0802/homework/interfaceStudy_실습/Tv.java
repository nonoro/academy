package ex0802.homework.interfaceStudy_실습;

import ex0802.homework.interfaceStudy_실습.Elec;
import ex0802.homework.interfaceStudy_실습.ElecFunction;

public class Tv extends Elec implements ElecFunction {
    private int chennel = 0;

    public Tv() {

    }

    public Tv(int chennel) {
        this.chennel = chennel;
    }

    public Tv(String code, int cost, int chennel) {
        super(code, cost);
        this.chennel = chennel;
    }

    @Override
    public void start() {
        System.out.println(super.getCode() + "제품" + " TV를 " + this.chennel + "을 본다");
    }

    @Override
    public void stop() {

    }

    @Override
    public void display() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", chennel=").append(chennel);
        return sb.toString();
    }
}
