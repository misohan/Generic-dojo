import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name ="Hello";
        int age =54;
        boolean bool = false;
        Student student = new Student("Michal", 58);
        List<Student> students = new ArrayList<Student>();
        List<Student> students1 = new ArrayList<Student>();


        students.add(student);

        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();

        recentlyUsedList.addObjectList(age);
        recentlyUsedList.addObjectList(bool);
        recentlyUsedList.addObjectList(name);
        recentlyUsedList.addObjectList(student);




        recentlyUsedList.getAllElements(recentlyUsedList.getListOfElements());







    }
}
