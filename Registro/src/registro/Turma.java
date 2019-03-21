package registro;

public class Turma {

	// Atributos
	private Alunos[] alunos;

	// Construtor
	Turma(int qntAluno) {
		this.setAlunos(new Alunos[qntAluno]);
	}

	private Alunos[] getAlunos() {
		return alunos;
	}

	private void setAlunos(Alunos[] alunos) {
		this.alunos = alunos;
	}

	private void addAlunos() {

	}

	private void deleteAluno() {

	}

	private void imprimeTurma() {

	}

}
