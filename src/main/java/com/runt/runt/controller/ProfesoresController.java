package com.runt.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.runt.business.ProfesoresBusiness;
import com.runt.runt.entity.ProfesoresEntity;

@RestController
@RequestMapping("/api/profesores")
public class ProfesoresController {

	@Autowired
	private ProfesoresBusiness profesoresBusiness;

	@GetMapping("/")
	public List<ProfesoresEntity> obtenerDatos() {
		return profesoresBusiness.obtenerProfesores();
	}
}
