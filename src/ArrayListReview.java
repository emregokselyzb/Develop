import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students =new ArrayList<>();

        students.add(new Student(1,"Emre"));
        students.add(new Student(2,"Jose"));
        students.add(new Student(3,"Sayed"));
        students.add(new Student(4,"Ronnie"));

        System.out.println(students.toString());

    }
}
