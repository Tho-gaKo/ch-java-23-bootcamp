package List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
            students.add("Flo");
            students.add("Timio");
            students.add("Kuan");
            students.add("Korak");
            students.add("William");
            students.add("Livio");


            System.out.println(students);

            Student flo = new Student();
            flo.setFirstName("Flo");
            Student bastian = new Student();
            bastian.setFirstName("bastian");
            bastian.setLastName("Bühler");
            bastian.setStudentNumber(1);

            School school = new School();

            school.addStudent(flo);
            school.addStudent(bastian);

        System.out.println(school);




    }
}
