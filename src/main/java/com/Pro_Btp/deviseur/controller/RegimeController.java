package com.Pro_Btp.deviseur.controller;

import com.Pro_Btp.deviseur.model.Formule;
import com.Pro_Btp.deviseur.model.Regime;
import com.Pro_Btp.deviseur.service.FormuleService;
import com.Pro_Btp.deviseur.service.PmssService;
import com.Pro_Btp.deviseur.service.RegimeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping("api/probtp/prodigeo/regime")
public class RegimeController {
    @Autowired
    RegimeService regimeService;

    @GetMapping("/{FormuleId}")
    public Optional<Regime> recupererUnRegime(@PathVariable("id") final Long id){
        return regimeService.recupererRegimeAvecId(id);
    }

    @GetMapping()
    public List<Regime> recupererLesRegime(){
        return regimeService.recupererToutLesRegimes();
    }

    @PostMapping("")
    public Regime ajouterRegime(@RequestBody Regime Regime){
        return regimeService.ajouterRegime(Regime);
    }

    @DeleteMapping("/{regimeId}")
    public void supprimerRegime (@PathVariable("regimeId") final Long regimeId){
        regimeService.supprimerRegime(regimeId);
    }

    @PutMapping("")
    public Regime modifierRegime(@RequestBody Regime regime){
        return regimeService.modifierLeRegime(regime);
    }
}
