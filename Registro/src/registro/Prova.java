package registro;

public class Prova {
	// Atributos
	public double[] notaAlunos = new double[4];
	public int[] peso;

	// Construtores
	public Prova() {
		this.notaAlunos =0;
		this.peso = 1;
	}

	public double[] getNotaAlunos() {
		return notaAlunos;
	}

	public void setNotaAlunos(double[] notaAlunos) {
		this.notaAlunos = notaAlunos;
	}

	public int[] getPeso() {
		return peso;
	}

	public void setPeso(int[] peso) {
		this.peso = peso;
	}
}
