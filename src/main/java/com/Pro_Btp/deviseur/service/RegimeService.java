package com.Pro_Btp.deviseur.service;

import com.Pro_Btp.deviseur.model.Pmss;
import com.Pro_Btp.deviseur.model.Regime;
import com.Pro_Btp.deviseur.repository.PmssRepository;
import com.Pro_Btp.deviseur.repository.RegimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RegimeService {
    @Autowired
    private RegimeRepository regimeRepository;

    public Regime ajouterRegime (Regime regime){
        return  regimeRepository.save(regime);
    }

    public Optional<Regime> recupererRegimeAvecId(Long id){
        return regimeRepository.findById(id);
    }

    public List<Regime> recupererToutLesRegimes (){
        return regimeRepository.findAll();
    }

    public Regime modifierLeRegime (Regime regime){
        return regimeRepository.save(regime);
    }

    public void supprimerRegime (Long id){
        regimeRepository.deleteById(id);
    }
}
