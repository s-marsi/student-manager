package com.est.gl.dao.database;
import java.util.List;
import com.est.gl.models.Student;

public class StudentDao {
    public List<Student> selectAllStudents() {
        return Database.STUDENTS;
    }

    public Student insertStudent(Student student) {
        Database.STUDENTS.add(student);
        return student;
    }
}
