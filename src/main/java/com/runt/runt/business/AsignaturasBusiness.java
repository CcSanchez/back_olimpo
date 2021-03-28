package com.runt.runt.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.runt.entity.AsignaturaEntity;
import com.runt.runt.repository.AsignaturaRepository;

@Service
public class AsignaturasBusiness {

	@Autowired
	private AsignaturaRepository asignaturaRepository;

	public List<AsignaturaEntity> obtenerAsignaturasProfesor(Integer idProfesor) {
		try {
			return asignaturaRepository.findByIdProfesor(idProfesor);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
