package com.Pro_Btp.deviseur.controller;

import com.Pro_Btp.deviseur.model.Pmss;
import com.Pro_Btp.deviseur.service.PmssService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping("api/probtp/prodigeo/pmss")
public class PmssController {
    @Autowired
    PmssService pmssService;

    @GetMapping("/{addressId}")
    public Optional<Pmss> recupererUnPmss(@PathVariable("id") final String id){
        return pmssService.recupererPmssAvecId(id);
    }

    @GetMapping()
    public List<Pmss> recupererLesPmss(){
        return pmssService.recupererToutLesPmss();
    }

    @PostMapping("")
    public Pmss ajouterPmss(@RequestBody Pmss pmss){
        return pmssService.ajouterPmss(pmss);
    }

    @DeleteMapping("/{pmssId}")
    public void supprimerPmss (@PathVariable("pmssId") final String pmssId){
        pmssService.supprimerPmss(pmssId);
    }

    @PutMapping("")
    public Pmss modifierPmss(@RequestBody Pmss pmss){
        return pmssService.modifierLePmss(pmss);
    }
}
