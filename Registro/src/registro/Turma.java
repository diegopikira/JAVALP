package registro;

import java.util.Scanner;

public class Turma {

	// Atributos
	private Alunos alunos[];
	private int aux = 0;
	static Scanner teclado = new Scanner(System.in);

	// Construtor
	Turma(int qntAluno) {
		alunos = new Alunos[qntAluno];
	}

	// Métodos
	public boolean addAluno(Alunos aluno, int ultimoAluno) {

		if (ultimoAluno == 0) {
			alunos[ultimoAluno] = aluno;
			System.out.println("\nAluno Cadastrado!");
		} else {
			for (int i = 0; i < ultimoAluno; i++) {
				if (alunos[i].getMatricula() == aluno.getMatricula()) {
					System.out.println("\nMatricula já existente.");
					aux = 1;
					break;
				}

			}

		}
		if (aux == 0) {
			alunos[ultimoAluno] = aluno;
			System.out.println("\nAluno Cadastrado!");
			return true;
		}
		return false;

	}

	public void deleteAluno() {

	}

	public void imprimeTurma(Alunos aluno) {
		for (int i = 0; i <= alunos.length; i++) {
			System.out.println("Lista: " + aluno.nomeAluno[i] + "");
		}

	}

}
