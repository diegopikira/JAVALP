package registro;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	private void abrirMenu() {
		System.out.println("-----MENU-----");
		System.out.println("1-Adicionar aluno");
		System.out.println("2-Remover aluno");

	}

	public static void main(String[] args) {

		String opcao;
		Main m = new Main();
		Scanner teclado =new Scanner(System.in);
		m.abrirMenu();
		opcao =JOptionPane.showInputDialog("Entre com a opção:");
		JOptionPane.showMessageDialog(null, "Entrou com a opção " + opcao + "");
		//Alunos alunos = new Alunos("Diego", 00613300, "BD");
		//Turma turma = new Turma(40);
		//System.out.print(alunos);
	}

}
