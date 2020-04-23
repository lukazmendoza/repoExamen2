package com.examen.examenDH;

public class Alumno {
	
	//A2
	private Integer codAlumno;
	private String nombre;
	private String apellido;
	//A3
	public Alumno(Integer codAlumno, String nombre, String apellido) {
		super();
		this.codAlumno = codAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//A4
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
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
		Alumno other = (Alumno) obj;
		if (codAlumno == null) {
			if (other.codAlumno != null)
				return false;
		} else if (!codAlumno.equals(other.codAlumno))
			return false;
		return true;
	}
	
}