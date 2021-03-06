package formacion.talleres.junit;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeMatriculacionModerno {
	
	public final String SALTO_DE_LINEA = "\n";

	public String process() {
		//Declaramos las variables que nos harán falta
		String resguardoMatricula = null;
		AlumnoAventajado alumnoAventajado = null;
		AlumnoAventajado alumnoMatriculado = null;
		List<MateriaModerna> listaDeMaterias = null;
		
		//Creamos el alumno aventajado y la lista de materias matriculables
		alumnoAventajado = crearAlumnoAventajado();
		listaDeMaterias = crearListaDeMateriasModernas();
		
		//Si los datos del alumno están bien cumplimentados, procedemos a la matriculación
		if(alumnoAventajado.sonCorrectosLosDatosPersonales()) {
			alumnoAventajado.setMateriasMatriculadas(listaDeMaterias);
			alumnoAventajado.matricularAlumno();
			//Generamos el resguardo de la matrícula
			resguardoMatricula = generaResguardo(alumnoMatriculado);
		}
		
		return resguardoMatricula;
	}
	
	public AlumnoAventajado crearAlumnoAventajado() {
		AlumnoAventajado alumnoAventajado = new AlumnoAventajado();
		alumnoAventajado.insertarDatosPersonales("Alfrodo", "Bolson", "Cerrado");
		return alumnoAventajado;
	}
	
	public List<MateriaModerna> crearListaDeMateriasModernas() {
		List<MateriaModerna> listaDeMaterias = new ArrayList<MateriaModerna>();
		MateriaModerna matematicas = new MateriaModerna("Matematicas",9,"o");
		MateriaModerna programacion = new MateriaModerna("Programacion",6,"t");
		listaDeMaterias.add(matematicas);
		listaDeMaterias.add(programacion);
		return listaDeMaterias;
	}
	
	public String generaResguardo(AlumnoAventajado alumnoMatriculado){
		StringBuffer resguardo = new StringBuffer();
		List<MateriaModerna> materiasMatriculadas = alumnoMatriculado.getMateriasMatriculadas();
		resguardo.append(alumnoMatriculado.obtenerNombreYApellidos());
		resguardo.append(SALTO_DE_LINEA);
		for(MateriaModerna materia : materiasMatriculadas){
			resguardo.append(materia.toString());
			resguardo.append(SALTO_DE_LINEA);
		}
		return resguardo.toString();
	}
}
