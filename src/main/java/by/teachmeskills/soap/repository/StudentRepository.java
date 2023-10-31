package by.teachmeskills.soap.repository;

import by.teachmeskills.soap.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    private static final List<Student> students = new ArrayList<>();

    @PostConstruct
    public void initData() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("Svetlana");
        student2.setName("Irina");
        student3.setName("Ivan");
        student1.setSurname("Kozlova");
        student2.setSurname("Ivanova");
        student3.setSurname("Gyrin");
        student1.setAge(18);
        student2.setAge(17);
        student3.setAge(19);
        student1.setGroup("FMO");
        student2.setGroup("FMO");
        student3.setGroup("EC");
        student1.setCourse(2);
        student2.setCourse(1);
        student3.setCourse(5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public Student findStudent(String name) {
        Student result = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                result = student;
            }
        }
        return result;
    }
}