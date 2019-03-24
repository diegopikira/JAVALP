package registro;

import java.util.Scanner;

public class Turma {

	// Atributos
	private Alunos aluno[];
	static Scanner teclado = new Scanner(System.in);

	// Construtor
	Turma(int qntAluno) {
		aluno = new Alunos[qntAluno];
	}


	public void deleteAluno() {

	}

	public static void imprimeTurma(Alunos[] aluno) {
		System.out.println("\nLista de Alunos:");
		for (int i = 0; i < aluno.length; ++i) {
			System.out.println(aluno[i].getNomeAluno());
		}

	}
}
