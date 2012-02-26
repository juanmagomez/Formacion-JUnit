package formacion.talleres.junit;
import java.util.List;
import java.util.ArrayList;



public class AlumnoAventajado {

	private final String SEPARADOR = " ";
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private List<MateriaModerna> materiasMatriculadas;
	
	public AlumnoAventajado() {
		this.materiasMatriculadas = new ArrayList<MateriaModerna>();
	}
	
	// Si luego hay un método para matricular asignaturas, no entiendo el
	// por qué de este! :D
	public AlumnoAventajado(List<MateriaModerna> materias) {
		this.materiasMatriculadas = materias;
	}
	
	public void insertarDatosPersonales(String nombre, String primerApellido, String segundoApellido) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	private boolean esUnaCadenaVacia(String laCadena) {
		return (laCadena == null || "".equals(laCadena));
	}
	
	public boolean elNombreEstaVacio() {
		return esUnaCadenaVacia(this.nombre);
	}
	
	public boolean elPrimerApellidoEstaVacio() {
		return esUnaCadenaVacia(this.primerApellido);
	}
	
	public boolean elSegundoApellidoEstaVacio() {
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
		for(MateriaModerna materia : this.materiasMatriculadas){
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
