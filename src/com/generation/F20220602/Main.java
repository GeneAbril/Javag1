package com.generation.F20220602;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Profesor profesor = new Profesor();
		List<String> listaAlumnos = new ArrayList<String>();
		listaAlumnos.add("Juan");
		listaAlumnos.add("Maria");
		listaAlumnos.add("Carolina");
		profesor.Asistencia(listaAlumnos);
		

	}
}