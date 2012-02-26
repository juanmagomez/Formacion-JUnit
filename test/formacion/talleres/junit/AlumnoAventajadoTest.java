package formacion.talleres.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlumnoAventajadoTest {
	
	@Test
	public void datosDeAlumnoSonIncorrectos() {
		AlumnoAventajado alumnoAventajado = new AlumnoAventajado();
		alumnoAventajado.insertarDatosPersonales("Juanma", "Gomez", null);
		assertFalse(alumnoAventajado.sonCorrectosLosDatosPersonales());
	}
	
	@Test
	public void datosDeAlumnoSonCorrectos() {
		AlumnoAventajado alumnoAventajado = new AlumnoAventajado();
		alumnoAventajado.insertarDatosPersonales("Juanma", "Gomez", "Ramos");
		assertTrue(alumnoAventajado.sonCorrectosLosDatosPersonales());
	}
	
	@Test
	public void alumnoSinNombre() {
		AlumnoAventajado alumnoSinNombre = new AlumnoAventajado();
		alumnoSinNombre.insertarDatosPersonales(null, "Gomez", "Ramos");
		assertTrue(alumnoSinNombre.elNombreEstaVacio());
	}
	
}
