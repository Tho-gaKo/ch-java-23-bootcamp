package Exceptions;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }
    public Optional<Student> findStudentById(String id) throws Exception{
        try {
            return repo.findStudentById(id);
        }catch (Exception exceptionName) {
            throw new Exception(exceptionName) ;
        }


        Optional<Student> studentById = repo.findStudentById(id);



    }
}