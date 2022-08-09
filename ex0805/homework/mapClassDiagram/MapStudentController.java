package ex0805.homework.mapClassDiagram;

import java.util.Map;

public class MapStudentController {
    private static MapStudentService service = new MapStudentService();

    public MapStudentController() {

    }

    public static void selectAll() {
        try {
            Map<String, Person> map = service.selectAll();
            EndView.printAll(map);
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    }

    public static void searchById(String id) {
        try {
            Person person = service.searchByKey(id);
            EndView.printSearch(person);
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }

    }

    public static void insert(Person person) {
        try {
            service.insert(person);
            EndView.printMessage("등록되었습니다.");
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }

    }

    public static void delete(String id) {
        try {
            service.delete(id);
            EndView.printMessage(id + "가 제거되었습니다.");
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    }

    public static void update(Person person) {
        try {
            service.update(person);
            EndView.printMessage("수정되었습니다.");
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }

    }

}
