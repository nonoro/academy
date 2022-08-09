package ex0805.homework.mapClassDiagram;

import java.util.HashMap;
import java.util.Map;

public class MapStudentService {

    private Map<String, Person> map = new HashMap<>();

    public MapStudentService() {
        map.put("jang", this.create("jang", "장희정", 22)); // Person
        map.put("kim", this.create("kim", "김희선", 25)); // Person

        map.put("queen", this.create("queen", "이효리", 40, 70, 80, 90)); // Student
        map.put("king", this.create("king", "송중기", 33, 80, 90, 60)); // Student
        map.put("girl", this.create("girl", "송혜교", 30, 95, 95, 70)); // Student


    }

    /**
     * map에 저장할 객체를 생성해서 리턴해주는 메소드
     * ex) Person or Student 리턴
     */

    public Person create(String id, String name, int age, int... paramas) {
        /**
         * 샘플 데이터를 map에 생성자를 이용해서 저장한다.
         */
        if (paramas.length == 0) {
            return new Person(id, name, age);
        } else {
            return new Student(id, name, age, paramas[0], paramas[1], paramas[2]);
        }
    }

    public Map<String, Person> selectAll() {
        if (map.isEmpty()) {
            throw new RuntimeException("게시물이 존재하지 않습니다.");
        }
        return map;
    }


    /**
     * key에 해당하는 정보 검색
     * :key해당하는 정보를 출력할때
     * [ Person인경우는 이름만 출력
     * Student인경우는 이름과 총점 출력 ] -> EndView에서
     * 없는경우는 "id는 없습니다." 예외발생
     **/
    public Person searchByKey(String id) {
        Person person = map.get(id);
        if (person == null) {
            throw new RuntimeException(id + "에 해당하는 정보는 없습니다");
        }
        return person;
    }

    public void insert(Person person) {
        if (map.containsKey(person.getId())) {
            throw new RuntimeException(person.getId() + "는/은 이미 존재하는 아이디로 등록하실 수 없습니다.");
        }
        map.put(person.getId(), person);

    }

    public void delete(String id) {
        if (map.containsKey(id)) {
            Person removeObject = map.remove(id); // 제거가 될 객체를 리턴해준다. 제거가 안되면 null을 리턴해준다
            System.out.println("제거된 객체 = " + removeObject);
            return;
        }
        throw new RuntimeException(id + "는/은 존재하지 않는 아이디입니다.");
    }


    /**
     * 수정
     * 만약, Person인경우 - 이름만 수정
     * Student인경우  - 이름, 국어 ,영어,수학수정(총점 변경)
     * <p>
     * 수정이 안된다면 예외발생
     */
    public void update(Person person) {
        Person savedPerson = map.get(person.getId());
        if (savedPerson == null) {
            throw new RuntimeException(person.getId() + "는/은 존재하지 않는 아이디이므로 수정 할 수 없습니다.");
        }
        if (savedPerson instanceof Student) {
            if (person instanceof Student) {
                // 수정하자
                savedPerson.setName(person.getName());
                ((Student) savedPerson).setKor(((Student) person).getKor());

                // ObjectDownCasting을 해서 국어, 영어, 수학, 총점 변경해보자
                Student savedSt = (Student) savedPerson;
                Student paramSt = (Student) person;

                savedSt.setKor(paramSt.getKor());
                savedSt.setEng(paramSt.getEng());
                savedSt.setMath(paramSt.getMath());

                // 총점 변경
                int sum = savedSt.getKor() + savedSt.getEng() + savedSt.getMath();

                savedSt.setSum(sum);

            } else {
                throw new RuntimeException("타입 오류로 수정 할 수 없습니다.");
            }
        } else {
            //Person이다
            if (person instanceof Student) {
                throw new RuntimeException("타입 오류로 수정 할 수 없습니다.");
            } else {
                savedPerson.setName(person.getName());
            }
        }
    }

}
