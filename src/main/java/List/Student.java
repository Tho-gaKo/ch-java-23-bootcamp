package List;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
