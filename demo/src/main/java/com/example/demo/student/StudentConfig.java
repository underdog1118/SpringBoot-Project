package com.example.demo.student;

import static java.time.Month.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student jona = new Student(
          "Jona",
          "jonqzp@gmail.com",
           LocalDate.of(1999, APRIL,5)
      );

      Student alex = new Student(
          "Alex",
          "alex@gmail.com",
          LocalDate.of(2005, JANUARY,1)
      );

      // add to the database
      repository.saveAll(
          List.of(jona, alex)
      );
    };
  }
}
