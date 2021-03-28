package com.runt.runt.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.runt.entity.ColegioEntity;
import com.runt.runt.repository.ColegiosRepository;

@Service
public class ColegiosBusiness {

	@Autowired
	private ColegiosRepository colegiosRepository;

	@SuppressWarnings("null")
	public List<ColegioEntity> obtenerColegios() {
		return colegiosRepository.findAll();

	}

	public ColegioEntity nuevoColegio(ColegioEntity colegio) {
		return colegiosRepository.save(colegio);

	}

}
