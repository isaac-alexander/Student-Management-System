package com.alex.student_management_system;

import com.alex.student_management_system.entity.Student;
import com.alex.student_management_system.entity.Teacher;
import com.alex.student_management_system.repository.StudentRepository;
import com.alex.student_management_system.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

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

//        Teacher teacher1 = new Teacher("Angela", "Stones", "angela@gmail.com", "HTML");
//        teacherRepository.save(teacher1);
//
//        Teacher teacher2 = new Teacher("Kayode", "Godwin", "godwin@gmail.com", "CSS");
//        teacherRepository.save(teacher2);
//
//        Teacher teacher3 = new Teacher("Emmanuel", "Charlie", "emma@gmail.com", "Java");
//        teacherRepository.save(teacher3);
    }
}
