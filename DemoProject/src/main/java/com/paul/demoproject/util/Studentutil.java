package com.paul.demoproject.util;

import com.paul.demoproject.dto.StudentDashboard;
import com.paul.demoproject.dto.SubjectGpaDto;
import com.paul.demoproject.entity.Student;
import com.paul.demoproject.enums.Grade;
import com.paul.demoproject.enums.HSCSubject;
import com.paul.demoproject.enums.SSCSubject;

import java.util.ArrayList;
import java.util.List;

public class Studentutil {
    public static StudentDashboard convertStudentToStudentDashboard(Student student) {
        List<SubjectGpaDto> ssc = new ArrayList<>();
        List<SubjectGpaDto> hsc = new ArrayList<>();

        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setId(student.getId());
        studentDashboard.setFirstName(student.getFirstName());
        studentDashboard.setLastName(student.getLastName());
        studentDashboard.setEmail(student.getEmail());
        studentDashboard.setDob(student.getDob());
        studentDashboard.setAddress(student.getAddress());
        studentDashboard.setBoard(student.getBoard());
        studentDashboard.setContact(student.getContact());

        for (SSCSubject sscSubject : student.getSsc().getSubjectGradeMap().keySet()){
            String subject = SSCSubject.getLabelBySubject(sscSubject);
            String gpa = Grade.getLabelByGrade(student.getSsc().getSubjectGradeMap().get(sscSubject));
            SubjectGpaDto subjectGpaDto = new SubjectGpaDto();
            subjectGpaDto.setSubject(subject);
            subjectGpaDto.setGpa(gpa);
            ssc.add(subjectGpaDto);
        }
        // Converting SubjectGrade hashmap to List of SubjectGpa objects for hsc
        for(HSCSubject hscSubject: student.getHsc().getSubjectGradeMap().keySet()) {
            String subject = HSCSubject.getLabelBySubject(hscSubject);
            String gpa = Grade.getLabelByGrade(student.getHsc().getSubjectGradeMap().get(hscSubject));
            SubjectGpaDto subjectGpaDto = new SubjectGpaDto();
            subjectGpaDto.setSubject(subject);
            subjectGpaDto.setGpa(gpa);
            hsc.add(subjectGpaDto);
        }

        studentDashboard.setSsc(ssc);
        studentDashboard.setHsc(hsc);

        return studentDashboard;
    }

}
