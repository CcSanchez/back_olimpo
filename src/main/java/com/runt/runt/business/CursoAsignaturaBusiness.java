package com.runt.runt.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.runt.entity.EstudiantesEntity;
import com.runt.runt.repository.CursosAsignaturasRepository;

@Service
public class CursoAsignaturaBusiness {
	@Autowired
	private CursosAsignaturasRepository cursosAsignaturasRepository;

	public Optional<List<EstudiantesEntity>> obtenerEstudiantes(Integer idAsignatura) {
		return cursosAsignaturasRepository.findAllByAsignatura(idAsignatura);
	}

}
