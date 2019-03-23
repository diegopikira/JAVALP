package registro;

public class Alunos {
	// Atributos
	private int matricula;
	String nomeAluno;
	private String curso;
	private double notas;

	// Construtores
	Alunos(int matricula, String nomeAluno, String curso, double notas) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.curso = curso;
		this.notas = notas;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	
	
	void consultaNomeAluno() {

	}

	void consultaMatricula() {

	}

}
