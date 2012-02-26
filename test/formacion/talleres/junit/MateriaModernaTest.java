package formacion.talleres.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MateriaModernaTest {

	@Test
	public void comprobarMateriaModernaTroncalNoEsObligatoria() {
		MateriaModerna materiaTroncal = new MateriaModerna("Programaci—n", 6, "T");
		assertFalse(materiaTroncal.isObligatoria());
	}
	
	@Test
	public void comprobarMateriaModernaTroncalEsObligatoria() {
		MateriaModerna materiaTroncal = new MateriaModerna("Programaci—n", 6, "T");
		assertFalse(materiaTroncal.isObligatoria());
	}
	
	@Test
	public void comprobarMateriaModernaObligatoriaEsObligatoria() {
		MateriaModerna materiaObligatoria = new MateriaModerna("Matem‡ticas", 9, "O");
		assertTrue(materiaObligatoria.isObligatoria());
	}
	
	@Test
	public void comprobarMateriaModernaObligatoriaConLowerCaseEsObligatoria() {
		MateriaModerna materiaObligatoria = new MateriaModerna("Matem‡ticas", 9, "o");
		assertTrue(materiaObligatoria.isObligatoria());
	}
	
}
