package com.Pro_Btp.deviseur.controller;

import com.Pro_Btp.deviseur.model.Option;
import com.Pro_Btp.deviseur.model.Regime;
import com.Pro_Btp.deviseur.service.OptionService;
import com.Pro_Btp.deviseur.service.RegimeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Data
@RestController
@RequestMapping("api/probtp/prodigeo/option")
public class OptionController {
    @Autowired
    OptionService optionService;

    @GetMapping("/{id}")
        public Optional<Option> recupererUnOption(@PathVariable("id") final Long id){
            return optionService.recupererOptionAvecId(id);
        }

        @GetMapping()
        public List<Option> recupererLesOption(){
            return optionService.recupererToutLesOptions();
        }

        @PostMapping("")
        public Option ajouterOption(@RequestBody Option option){
            return optionService.ajouterOption(option);
        }

        @DeleteMapping("/{optionId}")
        public void supprimerOption (@PathVariable("optionId") final Long optionId){
            optionService.supprimerOption(optionId);
        }

        @PutMapping("")
        public Option modifierOption(@RequestBody Option option){
            return optionService.modifierLeOption(option);
        }
}
