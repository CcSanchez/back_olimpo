package com.runt.runt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ESTUDIANTES")
public class EstudiantesEntity {
	@Id
	@Column(name = "ID_ESTUDIANTE")
	private Integer idEstudiante;
	private String nombre;
	@Column(name = "ID_CURSO")
	private Integer idCurso;

//	@OneToMany
//	private List<CursosAsignaturasEntity> listaAsignaturas;

	public Integer getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	@Override
	public String toString() {
		return "EstudiantesEntity [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", idCurso=" + idCurso + "]";
	}

}
