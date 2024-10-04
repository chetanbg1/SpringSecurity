package com.gfarm.security.controller;

import com.gfarm.security.entiry.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"aaa",10),
            new Student(2,"bbb",20)
    ));
    @GetMapping
    public List<Student> getAll(){
        return students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request) {
   return (CsrfToken) request.getAttribute("_csrf");
    }
}
