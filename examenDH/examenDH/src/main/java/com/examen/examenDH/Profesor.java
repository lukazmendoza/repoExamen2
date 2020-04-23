package com.examen.examenDH;

public abstract class Profesor {
	
	//C2
	private Integer codProfesor;
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	
	//C3
	public Integer getCodProfesor() {
		return codProfesor;
	}
	public void setCodProfesor(Integer codProfesor) {
		this.codProfesor = codProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codProfesor == null) ? 0 : codProfesor.hashCode());
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
		Profesor other = (Profesor) obj;
		if (codProfesor == null) {
			if (other.codProfesor != null)
				return false;
		} else if (!codProfesor.equals(other.codProfesor))
			return false;
		return true;
	}
	
	//C4
	
}
