package formacion.talleres.junit;

public class MateriaModerna {

	private String nombre;
	private int creditos;
	//Tipos: "O" - Obligatoria; "T" - Troncal; "OP" - Optativa; "LC" - Libre Configuraci—n
	private String tipo;
	private boolean preMatriculada;
	private boolean matriculada;
	
	public MateriaModerna(String nombre, int creditos, String tipo){
		setNombre(nombre);
		setCreditos(creditos);
		setTipo(tipo);
	}
	
	public boolean isObligatoria(){
		return "O".equals(tipo);
	}
	
	public void matricularObligatoria(){
		this.setPreMatriculada(false);
		this.setMatriculada(true);
	}
	
	public void matricular() {
		if(this.isObligatoria()) {
			matricularObligatoria();
		} else {
			preMatricular();
		}
	}
	
	public void preMatricular(){
		this.setPreMatriculada(true);
		this.setMatriculada(false);
	}
	
	public String toString(){
		String toReturn = "";
		toReturn += this.nombre + " ";
		toReturn += this.creditos + " ";
		toReturn += this.tipo;
		
		return toReturn;
	}

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
		if(tipo != null && !"".equals(tipo)) {
			tipo = tipo.toUpperCase();
		}
		this.tipo = tipo;
	}

	public boolean isPreMatriculada() {
		return preMatriculada;
	}

	public void setPreMatriculada(boolean preMatriculada) {
		this.preMatriculada = preMatriculada;
	}

	public boolean isMatriculada() {
		return matriculada;
	}

	public void setMatriculada(boolean matriculada) {
		this.matriculada = matriculada;
	}
	
}
