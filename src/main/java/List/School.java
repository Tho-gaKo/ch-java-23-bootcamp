package List;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter


public class School {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getStudentNumber(), student);

    }

    @Override
    public String toString() {
        return students.toString();
    }
}
