package registro;

public class Prova {
	// Atributos
	private float[] notaAlunos;
	private int[] peso;

	// Construtores
	//public Prova(float[] notaAlunos, int[] peso) {
		//this.notaAlunos = 0.0;
		//this.peso = 1;
	//}

	private float[] NotaAlunos() {
		return notaAlunos;
	}

	private float[] setNotaAlunos(float[] notaAlunos) {
		this.notaAlunos = notaAlunos;
		return notaAlunos;
	}

	private int[] getPeso() {
		return peso;
	}

	private void setPeso(int[] peso) {
		this.peso = peso;
	}
}
