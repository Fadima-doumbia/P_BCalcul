package com.Pro_Btp.deviseur.controller;

import com.Pro_Btp.deviseur.dto.BrancheDto;
import com.Pro_Btp.deviseur.model.Branche;
import com.Pro_Btp.deviseur.model.Option;
import com.Pro_Btp.deviseur.service.BrancheService;
import com.Pro_Btp.deviseur.service.OptionService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping("api/probtp/prodigeo/branche")
public class BrancheController {
    @Autowired
    BrancheService brancheService;

    @GetMapping("/{brancheId}")
    public Optional<Branche> recupererUnOption(@PathVariable("id") final Long id){
        return brancheService.recupererBrancheAvecId(id);
    }

    @GetMapping()
    public List<Branche> recupererLesBranches(){
        return brancheService.recupererToutLesBranches();
    }

    @PostMapping("")
    public Branche ajouterOption(@RequestBody BrancheDto branche){
        return brancheService.ajouterBranche(branche);
    }

    @DeleteMapping("/{optionId}")
    public void supprimerOption (@PathVariable("brancheId") final Long brancheId){
        brancheService.supprimerBranche(brancheId);
    }

    @PutMapping("")
    public Branche modifierOption(@RequestBody Branche branche){
        return brancheService.modifierLeBranche(branche);
    }
}
