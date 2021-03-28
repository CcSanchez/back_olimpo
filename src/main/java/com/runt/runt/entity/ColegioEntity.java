package com.runt.runt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_COLEGIOS")
public class ColegioEntity {
	@Id
	@Column(name = "ID_COLEGIO")
	private Integer idColegio;
	private String nombre;

	public Integer getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(Integer idColegio) {
		this.idColegio = idColegio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "colegioEntity [idColegio=" + idColegio + ", nombre=" + nombre + "]";
	}

}
