package formacion.talleres.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MateriaModernaTest {

	private MateriaModerna materiaTroncal = null;
	private MateriaModerna materiaObligatoria = null;
	private MateriaModerna otraMateriaObligatoria = null;
	
	@Before
	public void setUp() {
		materiaTroncal = new MateriaModerna("Programaci—n", 6, "T");
		materiaObligatoria = new MateriaModerna("Matem‡ticas", 9, "O");
		otraMateriaObligatoria = new MateriaModerna("Matem‡ticas", 9, "o");
	}
	
	@Test
	public void materiaModernaTroncalNoEsObligatoria() {
		assertFalse(materiaTroncal.isObligatoria());
	}
	
	@Test
	public void materiaModernaTroncalEsObligatoria() {
		assertFalse(materiaTroncal.isObligatoria());
	}
	
	@Test
	public void materiaModernaObligatoriaEsObligatoria() {
		assertTrue(materiaObligatoria.isObligatoria());
	}
	
	@Test
	public void materiaModernaObligatoriaConLowerCaseEsObligatoria() {
		assertTrue(otraMateriaObligatoria.isObligatoria());
	}
	
	@Test
	public void materiaObligatoriaEstaMatriculada() {
		materiaObligatoria.matricular();
		assertTrue(materiaObligatoria.isMatriculada());
	}
	
	@Test
	public void materiaObligatoriaNoEstaPreMatriculada() {
		materiaObligatoria.matricular();
		assertFalse(materiaObligatoria.isPreMatriculada());
	}
	
	@Test
	public void materiaTroncalEstaPreMatriculada() {
		materiaTroncal.matricular();
		assertTrue(materiaTroncal.isPreMatriculada());
	}
	
	@Test 
	public void materiaTroncalNoEstaMatriculada() {
		materiaTroncal.matricular();
		assertFalse(materiaTroncal.isMatriculada());
	}
	
	@Test
	public void datosDeLaMateria() {
		String programacion = "Programaci—n 6 T";
		assertEquals(programacion, materiaTroncal.toString());
	}
	
}
