package ex0805.set;

import java.util.Objects;

public class Member {
    private String name;
    private int age;
    private String addr;

    public Member() {

    }

    public Member(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member : ");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", addr='").append(addr).append('\'');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member m = (Member) obj;
            if (name.equals(m.getName()) && age == m.getAge()) {
                return true;
            }
        }
        return false;
    }


}