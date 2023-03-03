package com.Pro_Btp.deviseur.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@Data
@Entity
@Table(	name = "pmss")
public class Pmss {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @Id @Column(length = 20)
    private String id;
    private int montant;
    private LocalDate date = LocalDate.of(2022, 05, 13);
}
