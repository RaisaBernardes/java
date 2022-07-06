package exercicio5_repositorio_locadora_de_carro;

public class Carro {

	private String modelo;
	private String placa;
	private boolean disponivel;
	private double valorDiaria;

		

	public Carro(String modelo, String placa, double valorDiaria) {
		super();
			
		this.modelo = modelo;
			
		this.placa = placa;
			
		this.valorDiaria = valorDiaria;
			
		this.disponivel=true;
	}

	public double getValorDiaria() {
			return valorDiaria;
	}

		
	public void setValorDiaria(double valorDiaria) {
			this.valorDiaria = valorDiaria;
	}

		
	public String getModelo() {
			return modelo;
	}

		
	public String getPlaca() {
			return placa;
		
	}

	public boolean isDisponivel() {
			return disponivel;
		
	}

	public void setDisponivel(boolean disponivel) {
			this.disponivel = disponivel;
		
	}
		
}












