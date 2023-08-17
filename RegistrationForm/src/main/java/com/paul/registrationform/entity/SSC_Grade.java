package com.paul.registrationform.entity;

import com.paul.registrationform.SubjectEnum.Grade;
import com.paul.registrationform.SubjectEnum.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class SSC_Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sscGradeId;



    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Subject subject;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Grade gpa;

}
