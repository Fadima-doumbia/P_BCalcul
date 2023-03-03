package com.Pro_Btp.deviseur.controller;

import com.Pro_Btp.deviseur.model.Formule;
import com.Pro_Btp.deviseur.model.Pmss;
import com.Pro_Btp.deviseur.service.FormuleService;
import com.Pro_Btp.deviseur.service.PmssService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping("api/probtp/prodigeo/formule")
public class FormuleController {
    @Autowired
    PmssService pmssService;
    @Autowired
    FormuleService formuleService;

    @GetMapping("/{FormuleId}")
    public Optional<Formule> recupererUnFormule(@PathVariable("id") final Long id){
        return formuleService.recupererFormuleAvecId(id);
    }

    @GetMapping()
    public List<Formule> recupererLesPFormule(){
        return formuleService.recupererToutLesFormules();
    }

    @PostMapping("")
    public Formule ajouterFormule(@RequestBody Formule Formule){
        return formuleService.ajouterFormule(Formule);
    }

    @DeleteMapping("/{formuleId}")
    public void supprimerFormule (@PathVariable("formuleId") final Long formuleId){
        formuleService.supprimerFormule(formuleId);
    }

    @PutMapping("")
    public Formule modifierFormule(@RequestBody Formule formule){
        return formuleService.modifierLeFormule(formule);
    }
}
