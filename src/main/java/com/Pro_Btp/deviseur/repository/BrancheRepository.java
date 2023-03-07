package com.Pro_Btp.deviseur.repository;

import com.Pro_Btp.deviseur.model.Branche;
import com.Pro_Btp.deviseur.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrancheRepository extends JpaRepository<Branche, Long> {
}
