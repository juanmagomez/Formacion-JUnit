package formacion.talleres.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlumnoAventajadoTest {
	
	private AlumnoAventajado alumnoAventajado;
	
	@Before
	public void setUp() {
		alumnoAventajado = new AlumnoAventajado();
		alumnoAventajado.insertarDatosPersonales("Bilbo", "Bolson", "Cerrado");
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
}
