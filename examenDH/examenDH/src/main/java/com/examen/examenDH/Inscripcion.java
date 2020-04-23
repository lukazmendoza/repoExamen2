package com.examen.examenDH;

import java.util.Date;
//F2
public class Inscripcion {
	
	private Alumno alumno;
	private Curso curso;
	private Date fecha;

	public Inscripcion(Alumno alumno, Curso curso, Date fecha) {
		super();
		this.alumno = alumno;
		this.curso = curso;
		this.fecha = fecha;
	}
	
	//F3
	Date fechaDelDia = new Date();

}
