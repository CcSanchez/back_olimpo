package com.runt.runt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.runt.business.CursoAsignaturaBusiness;
import com.runt.runt.entity.EstudiantesEntity;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudiantesAsignaturaController {
	@Autowired
	private CursoAsignaturaBusiness cursoAsignaturaBusiness;

	@GetMapping("/{idAsignatura}")
	public Optional<List<EstudiantesEntity>> obtenerDatos(@PathVariable("idAsignatura") Integer idAsignatura) {
		return cursoAsignaturaBusiness.obtenerEstudiantes(idAsignatura);
	}
}
