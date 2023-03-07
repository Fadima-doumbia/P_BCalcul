package com.Pro_Btp.deviseur.dto;

import com.Pro_Btp.deviseur.model.Option;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
public class BrancheDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomBranche;
    private String pmss;
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//    @JoinColumn(name = "branche_id")
    private Set<Option> options = new HashSet<>();
}
