import java.util.*;

public class SetReview {

    public static void main(String[] args) {

        //1.Create a set

        Set<Student>  myset=new HashSet<>();

        myset.add(new Student(7,"ibadet"));
        myset.add(new Student(8,"Ahmet"));
        myset.add(new Student(9,"Muhabbet"));

        myset.add(new Student(9,"Muhabbet"));

        System.out.println(myset);

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);

        System.out.println(numSet.add(22));



    }
}
