import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nam",20,"HN");
        Student s2 = new Student("Hung",21,"HN");
        Student s3 = new Student("Ha",22,"HN");

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,s1);
        studentMap.put(2,s2);
        studentMap.put(3,s3);
        studentMap.put(4,s1);

        for (Map.Entry<Integer,Student> student:studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("..............Set");
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s1);

        for (Student student:students) {
            System.out.println(student);
        }
    }
}
