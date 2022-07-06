package exercicio98_revisao_ap1;

public class Carro {

private String marca;
private int idadeMinima= 18;
private Cliente cliente;

public Carro(String marca, Cliente cliente){
	this.marca=marca;
	this.cliente= cliente;

}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getIdadeMinima() {
	return idadeMinima;
}

public void setIdadeMinima(int idadeMinima) {
	this.idadeMinima = idadeMinima;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public String toString(){
	return "Marca: " + getMarca() + "\n" +
			"Cliente: " + getCliente().getNome() + "\n \t" +
						getCliente().getCpf() + "\n \t" +
						getCliente().getIdade();
			
			
			
}




}
