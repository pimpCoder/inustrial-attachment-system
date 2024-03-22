package com.pro.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pro.system.dto.StudentRegistrationRequest;
import com.pro.system.model.Student;
import com.pro.system.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(StudentRegistrationRequest request) {
        Student student = new Student(null, null, null, null, null, null);
        student.setFirstName(request.getName());
        student.setContactInformation(request.getContactInformation());
        

        return studentRepository.save(student);
    }
}