package ex0802.homework.interfaceStudy_실습;

public class Elec {
    private String code;
    private int cost;

    public Elec() {

    }

    public Elec(String code, int cost) {
        this.code = code;
        this.cost = cost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elec : ");
        sb.append("code='").append(code).append('\'');
        sb.append(", cost=").append(cost);
        return sb.toString();
    }
}
