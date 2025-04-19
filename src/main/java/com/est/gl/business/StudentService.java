package com.est.gl.business;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.est.gl.dao.database.StudentDao;
import com.est.gl.models.Student;

public class StudentService {
    private StudentDao dao;
    public StudentService(StudentDao _dao) {
        dao = _dao;
    }

    public Optional getStudentById(UUID id) {
        List<Student> students = dao.selectAllStudents();

        for (Student student: students) {
            if (student.id().equals(id)) {
                return Optional.of(student);
            }
        }
        return (Optional.empty());
    }

    public List<Student> getAllStudents() {
        return (dao.selectAllStudents());
    }
}
