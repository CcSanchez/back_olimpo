package com.runt.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.runt.business.ColegiosBusiness;
import com.runt.runt.entity.ColegioEntity;

@RestController
@RequestMapping("/api/colegios")
public class ColegiosController {

	@Autowired
	private ColegiosBusiness colegiosBuss;

	@GetMapping("/")
	public List<ColegioEntity> obtenerDatos() {
		return colegiosBuss.obtenerColegios();
	}

	@PostMapping("/")
	public ColegioEntity nuevoColegio(@RequestBody ColegioEntity colegio) {
		return colegiosBuss.nuevoColegio(colegio);
	}

}
