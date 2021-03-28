package com.runt.runt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.runt.runt.entity.AsignaturaEntity;

public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity, Integer> {

	List<AsignaturaEntity> findByIdProfesor(Integer idProfesor);
}
