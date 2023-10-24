package com.example.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
public class Student {
  // map Student class to a table in the database
  @Id
  @SequenceGenerator(
      name = "student_sequence",
      sequenceName = "student_sequence",
      allocationSize = 1
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "student_sequence"
  )

  private Long id;
  private String name;
  private String email;
  private LocalDate dob;
  private Integer age;



  public Student() {
  }

  public Student(Long id, String name, String email, LocalDate dob, Integer age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }

  public Student(String name, String email, LocalDate dob, Integer age) {
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }

  /**
   * Gets the value of id.
   *
   * @return the value of id
   */
  public Long getId() {
    return this.id;
  }

  /**
   * Sets the id.
   *
   * @param id id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets the value of name.
   *
   * @return the value of name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the value of email.
   *
   * @return the value of email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Sets the email.
   *
   * @param email email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets the value of dob.
   *
   * @return the value of dob
   */
  public LocalDate getDob() {
    return this.dob;
  }

  /**
   * Sets the dob.
   *
   * @param dob dob
   */
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  /**
   * Gets the value of age.
   *
   * @return the value of age
   */
  public Integer getAge() {
    return this.age;
  }

  /**
   * Sets the age.
   *
   * @param age age
   */
  public void setAge(Integer age) {
    this.age = age;
  }
}
