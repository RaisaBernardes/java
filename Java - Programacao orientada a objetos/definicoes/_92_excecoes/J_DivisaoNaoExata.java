package _92_excecoes;

public class J_DivisaoNaoExata extends Exception {

	private int num;
	private int dem;
	
	public J_DivisaoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + dem + " não é um inteiro!";
	}
	
}
