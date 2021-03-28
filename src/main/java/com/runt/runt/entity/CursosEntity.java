package com.runt.runt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CURSOS")
public class CursosEntity {
	@Id
	@Column(name = "ID_CURSO")
	private Integer idCurso;
	private Integer grado;
	private String salon;
	@Column(name = "ID_COLEGIO")
	private Integer idColegio;

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public Integer getGrado() {
		return grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public Integer getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(Integer idColegio) {
		this.idColegio = idColegio;
	}

	@Override
	public String toString() {
		return "CursosEntity [idCurso=" + idCurso + ", grado=" + grado + ", salon=" + salon + ", idColegio=" + idColegio
				+ "]";
	}

}
