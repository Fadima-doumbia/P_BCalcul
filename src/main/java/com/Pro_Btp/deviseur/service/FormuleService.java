package com.Pro_Btp.deviseur.service;

import com.Pro_Btp.deviseur.model.Formule;
import com.Pro_Btp.deviseur.model.Pmss;
import com.Pro_Btp.deviseur.repository.FormuleRepository;
import com.Pro_Btp.deviseur.repository.PmssRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FormuleService {
    @Autowired
    private PmssRepository pmssRepository;
    @Autowired
    private FormuleRepository formuleRepository;

    public Formule ajouterFormule (Formule formule){
//Verifier si le montant donnée par le gestionnaire correspond. taux * pmms le tout diviser par 100 pour avoir le vrai prix de la formule
        int pmss = formule.getPmss().getMontant();
        return  formuleRepository.save(formule);
    }

    public Optional<Formule> recupererFormuleAvecId(Long id){
        return formuleRepository.findById(id);
    }

    public List<Formule> recupererToutLesFormules (){
        return formuleRepository.findAll();
    }

    public Formule modifierLeFormule (Formule formule){
        return formuleRepository.save(formule);
    }

    public void supprimerFormule (Long id){
        formuleRepository.deleteById(id);
    }
}
