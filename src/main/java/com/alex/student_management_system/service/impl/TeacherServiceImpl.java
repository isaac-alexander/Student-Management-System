package com.alex.student_management_system.service.impl;

import com.alex.student_management_system.entity.Student;
import com.alex.student_management_system.entity.Teacher;
import com.alex.student_management_system.repository.TeacherRepository;
import com.alex.student_management_system.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll(); // returns list of teacher
    }


    @Override
    public boolean emailExists(String email) {
        return teacherRepository.existsByEmail(email);
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        if (teacherRepository.existsByEmail(teacher.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        return teacherRepository.save(teacher);
    }


    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }

}
