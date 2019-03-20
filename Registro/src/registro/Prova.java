package registro;

public class Prova {
	// Atributos
	public float[] notaAlunos;
	public int[] peso;

	// Construtores
	public Prova(float[] notaAlunos, int[] peso) {
		this.notaAlunos = 0.0;
		this.peso = 1;
	}

	public float[] NotaAlunos() {
		return notaAlunos;
	}

	public float[] setNotaAlunos(float[] notaAlunos) {
		this.notaAlunos = notaAlunos;
		return notaAlunos;
	}

	public int[] getPeso() {
		return peso;
	}

	public void setPeso(int[] peso) {
		this.peso = peso;
	}
}
