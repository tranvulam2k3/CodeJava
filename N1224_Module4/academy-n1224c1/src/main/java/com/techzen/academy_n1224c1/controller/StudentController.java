package com.techzen.academy_n1224c1.controller;

import com.techzen.academy_n1224c1.dto.ApiResponse;
import com.techzen.academy_n1224c1.exception.ApiException;
import com.techzen.academy_n1224c1.exception.ErrorCode;
import com.techzen.academy_n1224c1.model.Student;
import com.techzen.academy_n1224c1.service.IStudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentController {

     IStudentService studentService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Student>>> getStudent(@RequestParam(defaultValue = "") String name) {

        return ResponseEntity.ok(ApiResponse.<List<Student>>builder()
                .data(studentService.findByName(name))
                .build());
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Student>> getStudentById(@PathVariable int id) {
        Student student = studentService.findById(id);
        if (student == null) {
            throw new ApiException(ErrorCode.STUDENT_NOT_EXIST);
        }
        return ResponseEntity.ok(ApiResponse.<Student>builder()
                .data(student)
                .build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
//        student.setId(id);
//        Student studentSave = studentService.update(student);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(ApiResponse.<Student>builder()
//                        .data(studentSave)
//                        .build());
        // .................
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id) {
        studentService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
