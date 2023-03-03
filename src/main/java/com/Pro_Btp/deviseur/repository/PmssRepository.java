package com.Pro_Btp.deviseur.repository;

import com.Pro_Btp.deviseur.model.Pmss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmssRepository extends JpaRepository<Pmss, Long> {
}
