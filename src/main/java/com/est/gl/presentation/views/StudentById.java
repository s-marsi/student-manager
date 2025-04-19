package com.est.gl.presentation.views;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.est.gl.business.StudentService;
import com.est.gl.dao.database.StudentDao;

public class StudentById implements View{
    private static UUID id = UUID.fromString("6adb504c-7532-4845-a406-915c2731e577");
    @Override
    public void show() {
        StudentDao dao = new StudentDao();
        StudentService service = new StudentService(dao);

        Optional student = service.getStudentById(id);
        if (student.isPresent()) {
            System.out.println(student.get());
        }
    }
}
