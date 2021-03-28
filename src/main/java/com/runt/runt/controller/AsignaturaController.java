package com.runt.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.runt.business.AsignaturasBusiness;
import com.runt.runt.entity.AsignaturaEntity;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

	@Autowired
	private AsignaturasBusiness asignaturasBusiness;

	@GetMapping("/{idProfesor}")
	public List<AsignaturaEntity> obtenerDatos(@PathVariable("idProfesor") Integer idProfesor) {
		return asignaturasBusiness.obtenerAsignaturasProfesor(idProfesor);
	}
}
