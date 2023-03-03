package com.Pro_Btp.deviseur.service;

import com.Pro_Btp.deviseur.model.Pmss;
import com.Pro_Btp.deviseur.repository.PmssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PmssService {
    @Autowired
    private PmssRepository pmssRepository;

    public Pmss ajouterPmss (Pmss pmss){
        return  pmssRepository.save(pmss);
    }

    public Optional<Pmss> recupererPmssAvecId(String id){
        return pmssRepository.findById(id);
    }

    public List<Pmss> recupererToutLesPmss (){
        return pmssRepository.findAll();
    }

    public Pmss modifierLePmss (Pmss pmss){
        return pmssRepository.save(pmss);
    }

    public void supprimerPmss (String id){
        pmssRepository.deleteById(id);
    }
}
