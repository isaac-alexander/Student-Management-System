package com.alex.student_management_system.controller;

import com.alex.student_management_system.entity.Student;
import com.alex.student_management_system.entity.Teacher;
import com.alex.student_management_system.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        super();
        this.teacherService = teacherService;
    }

    // handler method to handle listTeacher and return model and view

    @GetMapping("/teachers")
    public String listTeacher(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());  // uses the attributeName "teachers" to connects the controller to the html
        return "teachers";
    }

    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model) {
        // create teacher object to hold teacher form data
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);  // uses the attributeName "teacher" to connects the controller to the html
        return "create_teacher"; // view/html
    }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher, Model model) {
        if (teacherService.emailExists(teacher.getEmail())) {
            model.addAttribute("error", "Email already exists!");  // uses the attributeName "error" to connects the controller to the html
            return "create_teacher";
        }
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", teacherService.getTeacherById(id));  // uses the attributeName "teacher" to connects the controller to the html
        return "edit_teacher";
    }

    @PostMapping("/teachers/{id}")
    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher, Model model) {
        // get teacher from database by id
        Teacher existingTeacher = teacherService.getTeacherById(id);
        existingTeacher.setId(id);
        existingTeacher.setFirstName(teacher.getFirstName());
        existingTeacher.setLastName(teacher.getLastName());
        existingTeacher.setEmail(teacher.getEmail());
        existingTeacher.setCourse(teacher.getCourse());

        // save updated teacher object
        teacherService.updateTeacher(existingTeacher);
        return "redirect:/teachers";
    }

    // handler method to handle delete teacher request

    @GetMapping("/teachers/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}
