package com.Pro_Btp.deviseur.repository;

import com.Pro_Btp.deviseur.model.Formule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormuleRepository extends JpaRepository<Formule, Long> {

}
