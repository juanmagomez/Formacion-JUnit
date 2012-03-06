package formacion.talleres.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AlumnoAventajadoTest {
	
	private AlumnoAventajado alumnoAventajado;
	private List<MateriaModerna> listaDeMaterias;
	
	private MateriaModerna unaMateria;
	private MateriaModerna otraMateria;
	
	@Before
	public void setUp() {
		alumnoAventajado = new AlumnoAventajado();
		alumnoAventajado.insertarDatosPersonales("Bilbo", "Bolson", "Cerrado");
		listaDeMaterias = new ArrayList<MateriaModerna>();
		//listaDeMaterias.add(unaMateria);
		//listaDeMaterias.add(otraMateria);
	}
	
	@Test
	public void datosDeAlumnoSonIncorrectos() {
		alumnoAventajado.insertarDatosPersonales("Bilbo", "Bolson", null);
		assertFalse(alumnoAventajado.sonCorrectosLosDatosPersonales());
	}
	
	@Test
	public void datosDeAlumnoSonCorrectos() {
		assertTrue(alumnoAventajado.sonCorrectosLosDatosPersonales());
	}
	
	@Test
	public void generacionDeNombreCompletoEsCorrecto() {
		assertEquals("Bilbo Bolson Cerrado", alumnoAventajado.obtenerNombreYApellidos());
	}
	
	@Test
	public void asignarMateriasAAlumno() {
		unaMateria = mock(MateriaModerna.class);
		otraMateria = mock(MateriaModerna.class);
		when(unaMateria.isObligatoria()).thenReturn(Boolean.TRUE);
		when(otraMateria.isObligatoria()).thenReturn(Boolean.FALSE);
		//doReturn(Boolean.TRUE).when(unaMateria).isObligatoria();
		//doReturn(Boolean.FALSE).when(otraMateria).isObligatoria();
		listaDeMaterias.add(unaMateria);
		listaDeMaterias.add(otraMateria);
		alumnoAventajado.setMateriasMatriculadas(listaDeMaterias);
		assertNotNull(alumnoAventajado.getMateriasMatriculadas());
	}
}
