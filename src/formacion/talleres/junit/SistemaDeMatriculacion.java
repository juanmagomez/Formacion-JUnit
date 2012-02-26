package formacion.talleres.junit;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeMatriculacion {

	public String process() {
		//Creamos el alumno
		Alumno alumno = new Alumno();
		alumno.setNombre("Alfonso");
		alumno.setPrimerApellido("Grijander");
		alumno.setSegundoApellido("Klander");
		
		//Creamos la lista de materias
		List<Materia> listaMaterias = new ArrayList<Materia>();
		
		//Materia MATEM�TICAS
		Materia matematicas = new Materia();
		matematicas.setNombre("Matem�ticas");
		matematicas.setCreditos(9);
		matematicas.setTipo("O");
		
		//A�adimos a la lista
		listaMaterias.add(matematicas);
		
		//Materia PROGRAMACI�N
		Materia programacion = new Materia();
		programacion.setNombre("Programaci�n");
		programacion.setCreditos(6);
		programacion.setTipo("T");
		
		//A�adimos a la lista
		listaMaterias.add(programacion);
		
		//Matriculamos al alumno
		for(Materia materia : listaMaterias) {
			//Si no es obligatoria, la prematriculamos
			if("O".equals(materia.getTipo())) {
				materia.setPreMatricula(false);
				materia.setMatriculada(true);
			} else {
				materia.setMatriculada(false);
				materia.setPreMatricula(true);
			}
		}
		
		//Si los datos del alumno son correctos
		if ((alumno.getNombre() != null && alumno.getNombre() != "") &&
			(alumno.getPrimerApellido() != null && alumno.getPrimerApellido() != "") &&
			(alumno.getSegundoApellido() != null && alumno.getSegundoApellido() != "")) {
				//Terminamos la matr�cula
				alumno.setMateriasMatriculadas(listaMaterias);
		}
		
		//Generamos el resguardo
		StringBuffer resguardo = new StringBuffer();
		resguardo.append(alumno.getNombre() + " " + alumno.getPrimerApellido() + " " + alumno.getSegundoApellido() + "\n");
		for(Materia materia : listaMaterias) {
			resguardo.append(materia.toString() + "\n");
		}
		
		return resguardo.toString();
	}
}
