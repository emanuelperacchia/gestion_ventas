package com.peracode.gestion_ventas.domain.repository;

import com.peracode.gestion_ventas.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
