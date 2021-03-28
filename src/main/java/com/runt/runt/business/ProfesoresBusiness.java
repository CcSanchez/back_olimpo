package com.runt.runt.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.runt.entity.ProfesoresEntity;
import com.runt.runt.repository.ProfesoresRepository;

@Service
public class ProfesoresBusiness {
	@Autowired
	private ProfesoresRepository profesoresRepository;

	public List<ProfesoresEntity> obtenerProfesores() {
		try {
			return profesoresRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}
}
