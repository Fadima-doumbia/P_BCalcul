package com.Pro_Btp.deviseur.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@Data
@Entity
@Table(	name = "branche")
public class Branche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomBranche;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "branche_id")
    private Set<Option> options = new HashSet<>();
}
