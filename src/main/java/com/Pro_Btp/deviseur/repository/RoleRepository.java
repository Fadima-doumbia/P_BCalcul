package com.Pro_Btp.deviseur.repository;

import com.Pro_Btp.deviseur.model.ERole;
import com.Pro_Btp.deviseur.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
