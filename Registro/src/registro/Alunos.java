package registro;

public class Alunos {
	// Atributos
	private int matricula;
	private String nomeAluno;
	private String curso;
	private Notas[] notas;

	// Construtores
	Alunos(String nomeAluno, int matricula, String curso, int qntnotas) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.curso = curso;
		this.setNotas(new Notas[qntnotas]);
	}

	public Notas[] getNotas() {
		return notas;
	}

	public void setNotas(Notas[] notas) {
		this.notas = notas;
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

	boolean statusMatricula() {
		return false;

	}

}
