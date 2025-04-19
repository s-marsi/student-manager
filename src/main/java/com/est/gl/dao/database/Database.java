package com.est.gl.dao.database;

import java.util.List;
import java.util.UUID;

import com.est.gl.models.Student;

public class Database {
    public static List<Student> STUDENTS = List.of(
        new Student(UUID.fromString("6adb504c-7532-4845-a406-915c2731e577"), "SOUFYANE", "TEST", "test@gmail.com"),
        new Student(UUID.fromString("6adb504c-7532-4845-a406-915c2731e577"), "YOUNES", "TEST", "younes@gmail.com"),
        new Student(UUID.fromString("6adb504c-7532-4845-a406-915c2731e577"), "AYMAN", "TEST", "ayman@gmail.com")
    ); 
}
