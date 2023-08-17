package com.paul.demoproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    private String board;
    private String password;
    private String contact;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ssc_id", referencedColumnName = "sscId")
    private SSC ssc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hsc_id", referencedColumnName = "hscId")
    private HSC hsc;
}

