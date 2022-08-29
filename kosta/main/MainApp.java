package kosta.main;

import kosta.dao.EmpDAO;
import kosta.vo.Emp;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("--1. ename 가져오기 ----------");
        EmpDAO.getSelectEname();

        System.out.println("--2. 사원 등록하기 ----------");
//        EmpDAO.insert(new Emp(9334, "쩡이", "백조", 5000));

        System.out.println("--3. 사원 등록하기(Prepared) ----------");
//        EmpDAO.preparedInsert(new Emp(9444, "효리", "가수", 2500));

        System.out.println("--4. 사원 전체 검색하기(Prepared) ----------");
        List<Emp> list = EmpDAO.selectAll();
        System.out.println("***** LIST 출력해보자 ****************");
        for (Emp e : list) {
            System.out.println(e);
        }

    }
}
