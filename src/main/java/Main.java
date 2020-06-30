import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name ="Hello";
        int age =54;
        boolean bool = false;
        Student student = new Student("Michal", 58);
        Student student1 = new Student("Andrej", 43);
        Student student2 = new Student("Ladislav", 43);
        List<Student> students = new ArrayList<Student>();
        List<Student> students1 = new ArrayList<Student>();

        students.add(student);
        students1.add(student);

        RecentlyUsedList recentlyUsedList = new RecentlyUsedList(3);

        recentlyUsedList.addObjectToList(student);
        recentlyUsedList.addObjectToList(bool);
        recentlyUsedList.addObjectToList(name);
        recentlyUsedList.addObjectToList(age);
        recentlyUsedList.addObjectToList(student);
        recentlyUsedList.addObjectToList(student);
        recentlyUsedList.addObjectToList(student);
        recentlyUsedList.addObjectToList(student1);
        recentlyUsedList.addObjectToList(name);
        recentlyUsedList.addObjectToList(bool);

        System.out.println(recentlyUsedList.getListOfElements());

    }
}
