package registro;

public class Notas {
	// Atributos
	private float provaAluno;
	private int peso;
	static int numProva;

	// Construtores
	public Notas(int numProva, int peso) {
		super();
		this.provaAluno = (float) 0.0;
		this.peso = 1;
	}

	public float getprovaAluno() {
		return provaAluno;
	}

	public void setprovaAluno(float provaAluno) {
		this.provaAluno = provaAluno;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
