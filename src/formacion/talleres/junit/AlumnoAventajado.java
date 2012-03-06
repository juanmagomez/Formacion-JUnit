package formacion.talleres.junit;
import java.util.List;



public class AlumnoAventajado {

	private final String SEPARADOR = " ";
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private List<MateriaModerna> materiasMatriculadas;
	
	public void insertarDatosPersonales(String nombre, String primerApellido, String segundoApellido) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	private boolean esUnaCadenaVacia(String laCadena) {
		return (laCadena == null || "".equals(laCadena));
	}
	
	private boolean elNombreEstaVacio() {
		return esUnaCadenaVacia(this.nombre);
	}
	
	private boolean elPrimerApellidoEstaVacio() {
		return esUnaCadenaVacia(this.primerApellido);
	}
	
	private boolean elSegundoApellidoEstaVacio() {
		return esUnaCadenaVacia(this.segundoApellido);
	}
	
	public boolean sonCorrectosLosDatosPersonales() { 
		if(elNombreEstaVacio() || elPrimerApellidoEstaVacio() || elSegundoApellidoEstaVacio()) {
			return false;
		}
		return true;
	}

	public void matricularAlumno(){
		for(MateriaModerna materia : materiasMatriculadas){
			materia.matricular();
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public List<MateriaModerna> getMateriasMatriculadas() {
		return materiasMatriculadas;
	}

	public void setMateriasMatriculadas(List<MateriaModerna> materias) {
		if(materias.size() > 0 
				&& hayAlgunaMateriaObligatoriaEnLaLista(materias)){
			this.materiasMatriculadas = materias;
		}
	}
	
	private boolean hayAlgunaMateriaObligatoriaEnLaLista(List<MateriaModerna> listaDeMaterias){
		for(MateriaModerna materia : listaDeMaterias){
			if(materia.isObligatoria()){
				return true;
			}
		}
		return false;
	}
	
	public String obtenerNombreYApellidos() {
		return getNombre() + SEPARADOR + getPrimerApellido() + SEPARADOR + getSegundoApellido();
	}
}
