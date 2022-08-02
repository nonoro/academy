package ex0802.homework.interfaceStudy_실습;

import ex0802.homework.interfaceStudy_실습.Elec;
import ex0802.homework.interfaceStudy_실습.ElecFunction;

public class Audio extends Elec implements ElecFunction {
    private int volumn = 0;

    public Audio() {

    }

    public Audio(int volumn) {
        this.volumn = volumn;
    }

    public Audio(String code, int cost, int volumn) {
        super(code, cost);
        this.volumn = volumn;
    }

    @Override
    public void start() {
        System.out.println(super.getCode()+ "의 Audio를 " + this.volumn + "으로 듣는다.");
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
        sb.append(", volumn=").append(volumn);
        return sb.toString();
    }
}
