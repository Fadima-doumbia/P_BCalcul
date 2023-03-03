package com.Pro_Btp.deviseur.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(	name = "formule")
public class Formule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_formule;
    private float taux_pmss;
    private float prix_formune;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apmss_Id", nullable = false)
    private Pmss pmss;
}
