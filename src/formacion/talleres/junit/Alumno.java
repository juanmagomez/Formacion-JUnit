package formacion.talleres.junit;

import java.util.List;


public class Alumno {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private List<Materia> materiasMatriculadas;
	
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
	public List<Materia> getMateriasMatriculadas() {
		return materiasMatriculadas;
	}
	public void setMateriasMatriculadas(List<Materia> materiasMatriculadas) {
		this.materiasMatriculadas = materiasMatriculadas;
	}
}
