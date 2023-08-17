package com.paul.registrationform.entity;

import com.paul.registrationform.SubjectEnum.Subject;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.swing.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class SSC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sscId;

    @OneToMany(targetEntity = SSC_Grade.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "SSC_fk", referencedColumnName = "sscId")
    private List<SSC_Grade> sscGrade;



}

