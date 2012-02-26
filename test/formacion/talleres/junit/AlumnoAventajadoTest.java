package formacion.talleres.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AlumnoAventajadoTest {
	
	private AlumnoAventajado alumnoAventajado;
	
	@Before
	public void setUp() {
		alumnoAventajado = new AlumnoAventajado();
	}
	
	@Test
	public void datosDeAlumnoSonIncorrectos() {
		alumnoAventajado.insertarDatosPersonales("Juanma", "Gomez", null);
		assertFalse(alumnoAventajado.sonCorrectosLosDatosPersonales());
	}
	
	@Test
	public void datosDeAlumnoSonCorrectos() {
		alumnoAventajado.insertarDatosPersonales("Juanma", "Gomez", "Ramos");
		assertTrue(alumnoAventajado.sonCorrectosLosDatosPersonales());
	}
	
	@Test
	public void alumnoSinNombre() {
		alumnoAventajado.insertarDatosPersonales(null, "Gomez", "Ramos");
		assertTrue(alumnoAventajado.elNombreEstaVacio());
	}
	
}
