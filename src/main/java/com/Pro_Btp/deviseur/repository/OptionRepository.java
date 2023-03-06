package com.Pro_Btp.deviseur.repository;

import com.Pro_Btp.deviseur.model.Option;
import com.Pro_Btp.deviseur.model.Regime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

}
