package com.paul.registrationform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class HSC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hscId;

    @Column(nullable = false)
    @NotBlank(message = "Subject is required")
    private String subject;

    private double gpa;
}
