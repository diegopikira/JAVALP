package registro;

public class Alunos {
	// Atributos
	private int matricula;
	private String nomeAluno;
	private String curso;

	// Construtores
	public Alunos(int matricula, String nomeAluno, String curso) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.curso = curso;
	}
	private int getMatricula() {
		return matricula;
	}

	

	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	private String getCurso() {
		return curso;
	}

	private void setCurso(String curso) {
		this.curso = curso;
	}

	private String getNomeAluno() {
		return nomeAluno;
	}

	private void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	void consultaNomeAluno() {

	}

	void consultaMatricula() {

	}
}
