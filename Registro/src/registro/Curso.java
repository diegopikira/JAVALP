package registro;

public class Curso {

	//Atributos
	public String[] nomeCurso;
	
	//Construtores
	public Curso(){
		this.nomeCurso = "Banco de Dados";
	}

	public String[] getNomeCurso() {
		return nomeCurso;
	}

	public String setNomeCurso(String[] nomeCurso) {
		this.nomeCurso = nomeCurso;
		return null;
	}

}
