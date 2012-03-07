package formacion.talleres.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SistemaDeMatriculacionModernoTest {

	@Test
	public void recuperamosMateriasMatriculadasDesAlumnoDentroDeGenerarResguardo() {
		SistemaDeMatriculacionModerno sistemaDeMatriculacion = new SistemaDeMatriculacionModerno();
		AlumnoAventajado alumnoAventajado = mock(AlumnoAventajado.class);
		MateriaModerna materiaModerna = mock(MateriaModerna.class);
		List<MateriaModerna> materiasMatriculadas = new ArrayList<MateriaModerna>();
		materiasMatriculadas.add(materiaModerna);
		
		when(alumnoAventajado.obtenerNombreYApellidos()).thenReturn("");
		when(materiaModerna.toString()).thenReturn("");
		when(alumnoAventajado.getMateriasMatriculadas()).thenReturn(materiasMatriculadas);
		
		sistemaDeMatriculacion.generaResguardo(alumnoAventajado);
		
		verify(alumnoAventajado).getMateriasMatriculadas();
	}
	
	@Test
	public void generarResguardoTest() {
		SistemaDeMatriculacionModerno sistemaDeMatriculacion = new SistemaDeMatriculacionModerno();
		String SEPARADOR = sistemaDeMatriculacion.SALTO_DE_LINEA;
		String NOMBRE_ALUMNO = "Perico el de los palotes";
		String MATERIA_TO_STRING = "Materia 1";
		String ALUMNO_Y_MATERIAS = NOMBRE_ALUMNO + SEPARADOR + MATERIA_TO_STRING + SEPARADOR;
		
		AlumnoAventajado alumnoAventajado = mock(AlumnoAventajado.class);
		MateriaModerna materiaModerna = mock(MateriaModerna.class);
		List<MateriaModerna> materiasMatriculadas = new ArrayList<MateriaModerna>();
		materiasMatriculadas.add(materiaModerna);
		
		when(alumnoAventajado.obtenerNombreYApellidos()).thenReturn(NOMBRE_ALUMNO);
		when(materiaModerna.toString()).thenReturn(MATERIA_TO_STRING);
		when(alumnoAventajado.getMateriasMatriculadas()).thenReturn(materiasMatriculadas);
		
		assertEquals(ALUMNO_Y_MATERIAS, sistemaDeMatriculacion.generaResguardo(alumnoAventajado));
	}
}
