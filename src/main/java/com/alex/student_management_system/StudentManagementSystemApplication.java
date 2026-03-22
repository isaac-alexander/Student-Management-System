package com.alex.student_management_system;

import com.alex.student_management_system.entity.Student;
import com.alex.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1 = new Student("Frank","Martins","frank@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("John","Jones","john@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Anita","Collins","anita@gmail.com");
//        studentRepository.save(student3);


    }
}
