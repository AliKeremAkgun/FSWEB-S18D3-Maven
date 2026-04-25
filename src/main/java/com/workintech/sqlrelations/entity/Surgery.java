package com.workintech.sqlrelations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "surgery")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String room;
    private String floor;

    // Hata veren eksik alanlar:
    @Column(name = "patient_id")
    private long patientId;

    @Column(name = "doctor_id")
    private long doctorId;

    @Column(name = "nurse_id")
    private long nurseId;
}