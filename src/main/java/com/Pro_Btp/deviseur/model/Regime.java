package com.Pro_Btp.deviseur.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(	name = "regime")
public class Regime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomRegime;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "regime_id")
    private Set<Formule> formule = new HashSet<>();
//    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "regimeId")
//    private Set<Formule> personsSet = new HashSet<>();
}
