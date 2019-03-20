package registro;

class Curso {

	// Atributos
	public String nomeCurso;

	// Construtores
	public Curso(){
		this.nomeCurso = "Banco de Dados";
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public String setNomeCurso(String nomeCurso) {
		return this.nomeCurso = nomeCurso;
	}
}

