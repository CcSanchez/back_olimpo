package com.runt.runt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.runt.runt.entity.CursosAsignaturasEntity;
import com.runt.runt.entity.EstudiantesEntity;

public interface CursosAsignaturasRepository extends JpaRepository<CursosAsignaturasEntity, Integer> {
	public Optional<List<EstudiantesEntity>> findAllByAsignatura(Integer idAsignatura);
}
