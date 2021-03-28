package com.runt.runt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CURSOS_ASIGNATURAS")
@NamedQuery(name = "CursosAsignaturasEntity.findAllByAsignatura", query = "SELECT TE " + "FROM EstudiantesEntity TE\r\n"
		+ "    INNER JOIN CursosAsignaturasEntity CA ON TE.idCurso = CA.idCurso\r\n"
		+ "    INNER JOIN AsignaturaEntity TA ON CA.idAsignatura = TA.idAsignatura\r\n"
		+ "WHERE TA.idAsignatura = :idAsignatura")
public class CursosAsignaturasEntity {
	@Id
	private Integer id;
	@Column(name = "ID_CURSO")
	private Integer idCurso;
	@Column(name = "ID_ASIGNATURA")
	private Integer idAsignatura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public Integer getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Integer idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	@Override
	public String toString() {
		return "CursosAsignaturasEntity [id=" + id + ", idCurso=" + idCurso + ", idAsignatura=" + idAsignatura + "]";
	}

}
