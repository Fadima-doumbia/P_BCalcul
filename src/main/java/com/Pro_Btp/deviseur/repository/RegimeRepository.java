package com.Pro_Btp.deviseur.repository;

import com.Pro_Btp.deviseur.model.Pmss;
import com.Pro_Btp.deviseur.model.Regime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegimeRepository extends JpaRepository<Regime, Long> {

}
