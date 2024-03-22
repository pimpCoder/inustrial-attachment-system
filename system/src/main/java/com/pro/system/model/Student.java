package com.pro.system.model;

import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table; 


@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_firstname")
    @NotBlank
    private String firstName;
    
    @Column(name = "student_lastname")

    @NotBlank
    private String lastName;

    @NotBlank
    @Column(unique = true)
    private String studentId;

    @Column(name = "student_programmeCode")
    @NotBlank
    private String programmeCode;

    @Column(name = "student_studentEmail")
    @NotBlank
    private String studentEmail;

    @Column(name = "student_contactInformation")
    @NotBlank
    private String contactInformation;


    

    public Student(String firstName, String lastName, String studentId, String programmeCode, String studentEmail,
            String contactInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.programmeCode = programmeCode;
        this.studentEmail = studentEmail;
        this.contactInformation = contactInformation;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
