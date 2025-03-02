package com.techzen.academy_n1224c1.repository;

import com.techzen.academy_n1224c1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IStudentReponsitory {
    List<Student> findByName(String name);

    Student findById(int id);

    Student save(Student student);

    void delete(int id);
}
