package registro;

public class Turma {

	// Atributos
	public boolean maxAluno = false;
	public static int vagasTurma = 40;
	public String semestreTurma;
	// public String nomeCurso;//FIX CODE

	// Atributos
	Turma() {
		this.semestreTurma = "3ºsemestre";
	}

	public void addAlunos() {
		if (maxAluno == false) {
			Alunos aluno = new Alunos();
			aluno.nomeAluno = Alunos.setNomeAluno(String);
			aluno.matricula = Alunos.setMatricula(int);
			aluno.curso= Curso.setNomeCurso(String);
			vagasTurma -= 1;
			if (vagasTurma == 0) {
				maxAluno = true;
			}
		}
	}

	public void deleteAluno() {
		maxAluno = false;

	}

	public void imprimeTurma() {

	}

	boolean statusMatricula() {
		return false;

	}

	public static void main(String[] args) {

	}

}
