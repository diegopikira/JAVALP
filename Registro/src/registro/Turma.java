package registro;

public class Turma {

	// Atributos
	private Alunos[] alunos;

	public Turma(int qntAluno) {
		this.setAlunos(new Alunos[qntAluno]);
	}

	public Alunos[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos[] alunos) {
		this.alunos = alunos;
	}

	public void adcAlunos() {

	}

	public void deleteAluno() {

	}

	public void imprimeTurma() {

	}

	boolean statusMatricula() {
		return false;

	}

	public static void main(String[] args) {

	}

}
