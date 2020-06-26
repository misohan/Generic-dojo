import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <E> void main(String[] args) {
        String name ="Hello";
        int age =54;
        boolean bool = false;
        Student student = new Student("Michal", 58);
        Student student1 = new Student("Andrej", 43);
        List<Student> students = new ArrayList<Student>();
        List<Student> students1 = new ArrayList<Student>();

        students.add(student);
        students1.add(student);

        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        List<E> listOfElements = recentlyUsedList.getListOfElements();

        recentlyUsedList.controller(listOfElements, student);
        recentlyUsedList.controller(listOfElements, student);

        System.out.println(recentlyUsedList.getListOfElements());

    }
}
