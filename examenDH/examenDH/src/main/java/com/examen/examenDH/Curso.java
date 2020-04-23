package com.examen.examenDH;

import java.util.List;

public class Curso {
	
	//B2
	private Integer codCurso;
	private String nombre;
	
	//E5
	private profesorTitular profesorTitular;
	private profesorAdjunto profesorAdjunto;
	private Integer cupoMaximoAlumnos;
	private List <Alumno> alumnosInscriptos;
	
	//B3
	public Integer getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//E6
	public profesorTitular getProfesorTitular() {
		return profesorTitular;
	}
	public void setProfesorTitular(profesorTitular profesorTitular) {
		this.profesorTitular = profesorTitular;
	}
	public profesorAdjunto getProfesorAdjunto() {
		return profesorAdjunto;
	}
	public void setProfesorAdjunto(profesorAdjunto profesorAdjunto) {
		this.profesorAdjunto = profesorAdjunto;
	}
	public Integer getCupoMaximoAlumnos() {
		return cupoMaximoAlumnos;
	}
	public void setCupoMaximoAlumnos(Integer cupoMaximoAlumnos) {
		this.cupoMaximoAlumnos = cupoMaximoAlumnos;
	}
	public List<Alumno> getAlumnosInscriptos() {
		return alumnosInscriptos;
	}
	public void setAlumnosInscriptos(List<Alumno> alumnosInscriptos) {
		this.alumnosInscriptos = alumnosInscriptos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCurso == null) ? 0 : codCurso.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codCurso == null) {
			if (other.codCurso != null)
				return false;
		} else if (!codCurso.equals(other.codCurso))
			return false;
		return true;
	}
	
	
	//B4
	
}
