package com.paul.demoproject.entity;


import com.paul.demoproject.enums.Grade;
import com.paul.demoproject.enums.SSCSubject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ssc_table")
public class SSC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sscId;

    @ElementCollection
    @MapKeyEnumerated(EnumType.STRING)
    @Enumerated(EnumType.STRING)
    private Map<SSCSubject, Grade> subjectGradeMap = new HashMap<>();

}