package com.est.gl.presentation.views;

import com.est.gl.business.StudentService;
import com.est.gl.dao.database.StudentDao;

public class StudentsList implements View {
    @Override
    public void show() {
        StudentDao dao = new StudentDao();
        StudentService service = new StudentService(dao);
        System.out.println(service.getAllStudents());
    }
}
