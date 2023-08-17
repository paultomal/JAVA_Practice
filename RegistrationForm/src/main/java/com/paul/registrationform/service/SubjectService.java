package com.paul.registrationform.service;

import com.paul.registrationform.SubjectEnum.Subject;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    public String getLabelBySubject(Subject subject) {
        return subject.toString();
    }

    public Subject getSubjectByLabel(String label) {
        for (Subject subject : Subject.values()) {
            if (subject.toString().equalsIgnoreCase(label)) {
                return subject;
            }
        }
        throw new IllegalArgumentException("Invalid subject label: " + label);
    }
}

