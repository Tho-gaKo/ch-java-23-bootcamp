package List;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter


public class School {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);

    }

    @Override
    public String toString() {
        return students.toString();
    }
}
