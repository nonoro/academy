package kosta.homework.src.vo;

public class Room {
    private int 강의실번호;
    private int 수용인원;

    public Room() {
    }

    public Room(int 강의실번호, int 수용인원) {
        this.강의실번호 = 강의실번호;
        this.수용인원 = 수용인원;
    }

    public int get강의실번호() {
        return 강의실번호;
    }

    public void set강의실번호(int 강의실번호) {
        this.강의실번호 = 강의실번호;
    }

    public int get수용인원() {
        return 수용인원;
    }

    public void set수용인원(int 수용인원) {
        this.수용인원 = 수용인원;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room[");
        sb.append("강의실번호=").append(강의실번호);
        sb.append(", 수용인원=").append(수용인원);
        sb.append(']');
        return sb.toString();
    }
}

