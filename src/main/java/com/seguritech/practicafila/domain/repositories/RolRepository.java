package com.seguritech.practicafila.domain.repositories;

import com.seguritech.practicafila.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolRepository extends JpaRepository<Rol, Long> {

    List<Rol> findByDescripcion(String descripcion);
}