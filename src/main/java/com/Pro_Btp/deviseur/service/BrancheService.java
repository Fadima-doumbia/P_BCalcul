package com.Pro_Btp.deviseur.service;

import com.Pro_Btp.deviseur.dto.BrancheDto;
import com.Pro_Btp.deviseur.model.*;
import com.Pro_Btp.deviseur.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class BrancheService {
    @Autowired
    private BrancheRepository brancheRepository;
    @Autowired
    private PmssRepository pmssRepository;
    @Autowired
    private FormuleRepository formuleRepository;
    @Autowired
    private RegimeRepository regimeRepository;
    @Autowired
    private OptionRepository optionRepository;
    private final ModelMapper modelMapper = new ModelMapper();


    public Branche ajouterBranche (BrancheDto branche){
//        Set<Formule> listeFormule= new HashSet<>();
//        Set<Regime> listeRegime= new HashSet<>();
        Set<Option> listeOption= new HashSet<>();
//        int nbr = 0;
        Optional<Pmss> pmss = pmssRepository.findById(branche.getPmss());
        Set<Option> optionSet = branche.getOptions();

        optionSet.forEach(option -> {
            Set<Regime> listeRegime= new HashSet<>();
            option.getRegimes().forEach(regime -> {
                Set<Formule> listeFormule= new HashSet<>();
                regime.getFormules().forEach(formule -> {
                    formule.setPmss(pmss.get());
                    Formule formuleOptional = formuleRepository.save(formule);
                    listeFormule.add(formuleOptional);
                });

                regime.setFormules(listeFormule);
                Regime regimeSauvegarde = regimeRepository.save(regime);
                listeRegime.add(regimeSauvegarde);
            });

            option.setRegimes(listeRegime);
            Option optionSauvegarde = optionRepository.save(option);
            listeOption.add(optionSauvegarde);
        });
        branche.setOptions(listeOption);
        Branche branche1 = modelMapper.map(branche, Branche.class);

        return  brancheRepository.save(branche1);
    }

    public Optional<Branche> recupererBrancheAvecId(Long id){
        return brancheRepository.findById(id);
    }

    public List<Branche> recupererToutLesBranches (){
        return brancheRepository.findAll();
    }

    public Branche modifierLeBranche  (Branche branche){
        return  brancheRepository.save(branche);
    }

    public void supprimerBranche (Long id){
        brancheRepository.deleteById(id);
    }
}
