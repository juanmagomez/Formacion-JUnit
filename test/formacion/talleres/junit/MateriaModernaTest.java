package formacion.talleres.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MateriaModernaTest {

	private MateriaModerna materiaTroncal = null;
	private MateriaModerna materiaObligatoria = null;
	private MateriaModerna otraMateriaObligatoria = null;
	
	@Before
	public void setUp() {
		materiaTroncal = new MateriaModerna("Programación", 6, "T");
		materiaObligatoria = new MateriaModerna("Matemáticas", 9, "O");
		otraMateriaObligatoria = new MateriaModerna("Matemáticas", 9, "o");
	}
	
	@Test
	public void comprobarMateriaModernaTroncalNoEsObligatoria() {
		assertFalse(materiaTroncal.isObligatoria());
	}
	
	@Test
	public void comprobarMateriaModernaTroncalEsObligatoria() {
		assertFalse(materiaTroncal.isObligatoria());
	}
	
	@Test
	public void comprobarMateriaModernaObligatoriaEsObligatoria() {
		assertTrue(materiaObligatoria.isObligatoria());
	}
	
	@Test
	public void comprobarMateriaModernaObligatoriaConLowerCaseEsObligatoria() {
		assertTrue(otraMateriaObligatoria.isObligatoria());
	}
	
}
