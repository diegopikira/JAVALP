package registro;

import java.util.Scanner;

public class Main {

	public static int qntAluno;
	static Scanner teclado = new Scanner(System.in);
	static int opcao = 0;
	static Main m = new Main();
	static Turma tur = new Turma(qntAluno);

	private void abrirMenu() {
		System.out.println("-----MENU-----");
		System.out.println("1-Cadastrar aluno");
		System.out.println("2-Remover aluno");
		System.out.println("3-Imprimir Lista de Alunos");
		System.out.println("4-Alterar Cadastro");
		opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			Scanner teclado = new Scanner(System.in);
			/*
			 * Alunos aluno = new Alunos(matricula, nomeAluno, curso, notas);;
			 * System.out.println("\n==== Cadastro de Alunos ====");
			 * System.out.println("\nMatricula: "); aluno.setMatricula(teclado.nextInt());
			 * System.out.println(aluno.getMatricula()); System.out.println("\nNome: ");
			 * aluno.setNomeAluno(teclado.nextLine());
			 * System.out.println(aluno.getNomeAluno()); System.out.println("\nCurso: ");
			 * aluno.setCurso(teclado.nextLine()); System.out.println(aluno.getCurso());
			 * System.out.println("\nNotas: "); aluno.setNotas(teclado.nextDouble());
			 * System.out.println(aluno.getNotas());
			 * 
			 * tur.addAluno(Alunos, qntAluno); case 2:
			 */
		case 3:
			Alunos aluno[] = new Alunos(00613300, "diego", "bd", 6.9);
			Alunos aluno2 = new Alunos(00613301, "renan", "bd", 6.9);
			Turma.imprimeTurma(aluno);

		case 4:
		}
	}

	public static void main(String[] args) {
		System.out.println("\nInforme a quantidade de alunos na Turma");
		qntAluno = teclado.nextInt();
		m.abrirMenu();

	}
}
