package registro;

import java.util.Scanner;

public class Alunos {
	// Atributos
	private int[] matricula;
	private String[] nomeAluno;
	private String[] curso;
	private double[] notas;
	private int aux = 0;
	static Scanner teclado = new Scanner(System.in);

	// Construtores
	Alunos(int[] matricula, String[] nomeAluno, String[] curso, double[] notas) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.curso = curso;
		this.notas = notas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int[] getMatricula() {
		return matricula;
	}

	public void setMatricula(int[] matricula) {
		this.matricula = matricula;
	}

	public String[] getCurso() {
		return curso;
	}

	public void setCurso(String[] curso) {
		this.curso = curso;
	}

	String[] getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String[] nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void consultaNomeAluno(Alunos aluno[]) {
		new  Alunos(matricula, nomeAluno, curso, notas);
		System.out.println("Informe o nome do Aluno que deseja pesquisar:");
		String nome = teclado.nextLine();
		for (int i=0; i < aluno.length; ++i) {
			if (aluno[i].getNomeAluno().equals(nome));{
				System.out.println("Aluno: " +aluno[i].getNomeAluno() +"Matricula: "+aluno[i].getMatricula()+"");
			}
		}
	}
	
	public boolean cadAluno(int[] matricula, String[] nomeAluno, String[] curso, double[] nota, int ultimoAluno) {
		Alunos aluno = new Alunos();
		aluno.matricula = matricula;
		aluno.nomeAluno = nomeAluno;
		aluno.curso = nomeAluno;
		aluno.notas = notas;
		
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

	void consultaMatricula() {

	}

}
