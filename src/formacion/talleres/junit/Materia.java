package formacion.talleres.junit;

public class Materia {
	
	private String nombre;
	private int creditos;
	//Tipos: "O" - Obligatoria; "T" - Troncal; "OP" - Optativa; "LC" - Libre Configuraci—n
	private String tipo;
	private boolean preMatricula;
	private boolean matriculada;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isPreMatricula() {
		return preMatricula;
	}

	public void setPreMatricula(boolean preMatricula) {
		this.preMatricula = preMatricula;
	}

	public boolean isMatriculada() {
		return matriculada;
	}

	public void setMatriculada(boolean matriculada) {
		this.matriculada = matriculada;
	}
	
	
}
