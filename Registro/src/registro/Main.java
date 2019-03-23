package registro;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static int qntAluno;
	static Scanner teclado = new Scanner(System.in);
	static int opcao = 0;
	static Main m = new Main();
	Turma tur = new Turma(qntAluno);

	private void abrirMenu() {
		System.out.println("-----MENU-----");
		System.out.println("1-Cadastrar aluno");
		System.out.println("2-Remover aluno");
		System.out.println("3-Imprimir Lista de Alunos");
		System.out.println("4-Alterar Cadastro");
		opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\n==== Cadastro de Alunos ====");
			Alunos aluno = new Alunos();
			System.out.println("\nMatricula: ");
			int matricula =(Integer.parseInt(teclado.nextLine()));
			System.out.println("\nNome: ");
			String nome =(teclado.nextLine());
			System.out.println("\nCurso: ");
			String curso = (teclado.nextLine());
			System.out.println("\nCurso: ");
			double notas = (Integer.parseInt(teclado.nextLine()));

			tur.addAluno(aluno);
		case 2:

		case 3:
			tur.imprimeTurma(aluno);

		case 4:
		}
	}

	public static void main(String[] args) {

		System.out.println("\nInforme a quantidade de alunos na Turma");
		qntAluno = teclado.nextInt();
		m.abrirMenu();
	}

}
