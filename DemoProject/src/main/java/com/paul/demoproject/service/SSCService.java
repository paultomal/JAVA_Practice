package com.paul.demoproject.service;

import com.paul.demoproject.dto.SubjectGpaDto;
import com.paul.demoproject.entity.SSC;
import com.paul.demoproject.enums.Grade;
import com.paul.demoproject.enums.SSCSubject;
import com.paul.demoproject.repository.SSCRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SSCService {
    private final SSCRepository sscRepository;

    public SSCService(SSCRepository sscRepository) {
        this.sscRepository = sscRepository;
    }

    public void addSubjectGradeMapping(List<SubjectGpaDto> ssc, SSC newSsc) {

        for (SubjectGpaDto subjectGpa : ssc) {
            SSCSubject subject = SSCSubject.getSubjectByLabel(subjectGpa.getSubject());
            Grade grade = Grade.getSubjectByLabel(subjectGpa.getGpa());
            newSsc.getSubjectGradeMap().put(subject, grade);
        }

        sscRepository.save(newSsc);
    }
}
