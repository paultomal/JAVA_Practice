package com.paul.demoproject.service;

import com.paul.demoproject.dto.SubjectGpaDto;
import com.paul.demoproject.entity.HSC;
import com.paul.demoproject.enums.Grade;
import com.paul.demoproject.enums.HSCSubject;
import com.paul.demoproject.repository.HSCRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HSCService {
    private final HSCRepository hscRepository;

    public HSCService(HSCRepository hscRepository) {
        this.hscRepository = hscRepository;
    }

    public void addSubjectGradeMapping(List<SubjectGpaDto> hsc, HSC newHsc) {

        for (SubjectGpaDto subjectGpa : hsc) {
            HSCSubject subject = HSCSubject.getSubjectByLabel(subjectGpa.getSubject());
            Grade grade = Grade.getSubjectByLabel(subjectGpa.getGpa());
            newHsc.getSubjectGradeMap().put(subject, grade);
        }
        hscRepository.save(newHsc);
    }

}