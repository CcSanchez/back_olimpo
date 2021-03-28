package com.runt.runt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PROFESORES")
public class ProfesoresEntity {

	@Id
	@Column(name = "ID_PROFESOR")
	private Integer idProfesor;
	private String nombre;

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "profesoresEntity [idProfesor=" + idProfesor + ", nombre=" + nombre + "]";
	}

}
