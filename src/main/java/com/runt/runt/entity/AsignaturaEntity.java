package com.runt.runt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ASIGNATURA")
public class AsignaturaEntity {
	@Id
	@Column(name = "ID_ASIGNATURA")
	private Integer idAsignatura;
	private String nombre;
	@Column(name = "ID_PROFESOR")
	private Integer idProfesor;

	public Integer getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Integer idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	@Override
	public String toString() {
		return "AsignaturaEntity [idAsignatura=" + idAsignatura + ", nombre=" + nombre + ", idProfesor=" + idProfesor
				+ "]";
	}

}
