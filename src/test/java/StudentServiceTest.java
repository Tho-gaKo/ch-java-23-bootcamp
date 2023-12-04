import Exceptions.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StudentServiceTest {

    @Test
    void StudentIdException_whenThrown_thenMessgEqualsActualMessage() {
        StudentService studentService = new StudentService();

        try {
            studentService.findStudentById("askidba");

            // ohnoooooo
            fail("Keine Exception");
        } catch (Exception e) {


            System.out.println("Exception ist wie erwartet aufgetreten.");
             //yay
        }
    }

}
