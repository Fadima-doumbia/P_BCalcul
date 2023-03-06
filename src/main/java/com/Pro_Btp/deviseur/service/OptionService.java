package com.Pro_Btp.deviseur.service;

import com.Pro_Btp.deviseur.model.Option;
import com.Pro_Btp.deviseur.model.Regime;
import com.Pro_Btp.deviseur.repository.OptionRepository;
import com.Pro_Btp.deviseur.repository.RegimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;

    public Option ajouterOption (Option option){
        return  optionRepository.save(option);
    }

    public Optional<Option> recupererOptionAvecId(Long id){
        return optionRepository.findById(id);
    }

    public List<Option> recupererToutLesOptions (){
        return optionRepository.findAll();
    }

    public Option modifierLeOption (Option option){
        return optionRepository.save(option);
    }

    public void supprimerOption (Long id){
        optionRepository.deleteById(id);
    }
}
