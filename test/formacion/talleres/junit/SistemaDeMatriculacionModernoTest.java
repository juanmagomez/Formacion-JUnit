package formacion.talleres.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SistemaDeMatriculacionModernoTest {

	SistemaDeMatriculacionModerno sistemaDeMatriculacion;
	AlumnoAventajado alumnoAventajado;
	MateriaModerna materiaModerna;
	List<MateriaModerna> materiasMatriculadas;
	
	@Before
	public void setUp() {
		sistemaDeMatriculacion = new SistemaDeMatriculacionModerno();
		alumnoAventajado = mock(AlumnoAventajado.class);
		materiaModerna = mock(MateriaModerna.class);
		materiasMatriculadas = new ArrayList<MateriaModerna>();
		materiasMatriculadas.add(materiaModerna);
	}
	
	@Test
	public void recuperamosMateriasMatriculadasDesAlumnoDentroDeGenerarResguardo() {
		when(alumnoAventajado.obtenerNombreYApellidos()).thenReturn("");
		when(materiaModerna.toString()).thenReturn("");
		when(alumnoAventajado.getMateriasMatriculadas()).thenReturn(materiasMatriculadas);
		
		sistemaDeMatriculacion.generaResguardo(alumnoAventajado);
		
		verify(alumnoAventajado).getMateriasMatriculadas();
	}
	
	@Test
	public void generarResguardoTest() {
		String SEPARADOR = sistemaDeMatriculacion.SALTO_DE_LINEA;
		String NOMBRE_ALUMNO = "Perico el de los palotes";
		String MATERIA_TO_STRING = "Materia 1";
		String ALUMNO_Y_MATERIAS = NOMBRE_ALUMNO + SEPARADOR + MATERIA_TO_STRING + SEPARADOR;
		
		when(alumnoAventajado.obtenerNombreYApellidos()).thenReturn(NOMBRE_ALUMNO);
		when(materiaModerna.toString()).thenReturn(MATERIA_TO_STRING);
		when(alumnoAventajado.getMateriasMatriculadas()).thenReturn(materiasMatriculadas);
		
		assertEquals(ALUMNO_Y_MATERIAS, sistemaDeMatriculacion.generaResguardo(alumnoAventajado));
	}
}
