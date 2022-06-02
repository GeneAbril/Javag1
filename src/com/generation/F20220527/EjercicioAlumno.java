package com.generation.F20220527;

public class EjercicioAlumno {
	
	//ATRIBUTOS
	private String colegio;
	private String curso;
	private String materia;
	private Double nota;
	
	
	//CONSTRUCTORES
	public EjercicioAlumno(String colegio, String curso, String materia, Double nota) {
		super();
		this.colegio = colegio;
		this.curso = curso;
		this.materia = materia;
		this.nota = nota;
	}

//ACCESADORES Y MUTADORES
	public EjercicioAlumno() {
		super();
	}

	public String getColegio() {
		return colegio;
	}


	public void setColegio(String colegio) {
		this.colegio = colegio;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}

	//FUNCIONES
	public void cantidadDeNotas() {
		this.nota= 10d;
		
	}
	
	
}
