package List;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Students {

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
}
