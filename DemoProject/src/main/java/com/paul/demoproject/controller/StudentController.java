package com.paul.demoproject.controller;

import com.paul.demoproject.dto.RegisterStudent;
import com.paul.demoproject.dto.StudentDashboard;
import com.paul.demoproject.entity.HSC;
import com.paul.demoproject.entity.SSC;
import com.paul.demoproject.entity.Student;
import com.paul.demoproject.enums.Grade;
import com.paul.demoproject.enums.HSCSubject;
import com.paul.demoproject.enums.SSCSubject;
import com.paul.demoproject.service.HSCService;
import com.paul.demoproject.service.SSCService;
import com.paul.demoproject.service.StudentService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class StudentController {
    private final StudentService studentService;
    private final SSCService sscService;
    private final HSCService hscService;

    public StudentController(StudentService studentService, SSCService sscService, HSCService hscService) {
        this.studentService = studentService;
        this.sscService = sscService;
        this.hscService = hscService;
    }

    @PostMapping("/addStudent")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public Student addStudent(@Valid @RequestBody RegisterStudent student) {
        student.setPassword((student.getPassword()));
        Student newStudent = new Student();
        newStudent.setSsc(new SSC());
        newStudent.setHsc(new HSC());
        sscService.addSubjectGradeMapping(student.getSsc(), newStudent.getSsc());
        hscService.addSubjectGradeMapping(student.getHsc(), newStudent.getHsc());

        return studentService.saveStudent(newStudent, student);
    }

    @GetMapping("/SSCSubjects")
    public List<String> getSSCSubjects() {
        return SSCSubject.getAllLabels();
    }

    @GetMapping("/HSCSubjects")
    public List<String> getHSCSubjects() {
        return HSCSubject.getAllLabels();
    }

    @GetMapping("/Grades")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public List<String> getGrades() {
        return Grade.getAllLabels();
    }

    @GetMapping("/students")
    @PreAuthorize("hasAnyAuthority('ROLE_STUDENT')")
    public List<StudentDashboard> getAllStudents() {
        return studentService.getStudents();
    }
}
