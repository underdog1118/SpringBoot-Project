package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path =  "api/v1/student") // http://localhost:8080/api/v1/student
public class StudentController {


  //Rest Endpoint
  @GetMapping
  public List<Student> getStudents() {
    return List.of(
        new Student(1L,
            "Jona",
            "jonqzp@gmail.com",
            LocalDate.of(2000, Month.APRIL,5),
            24
        )
    );
  }
}
