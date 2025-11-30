package com.peracode.gestion_ventas.domain.repository;

import com.peracode.gestion_ventas.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
