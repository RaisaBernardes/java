package exercicio98_revisao_ap1;

public class Cliente {

private String cpf;
private String nome;
private int idade;
private int qntCarros;

	
public Cliente(String nome, String cpf, int idade){
	
		this.cpf= cpf;
		this.nome= nome;
		this.idade= idade;
}
	
public String getCpf(){
	return this.cpf;
}
public String getNome(){
	return this.nome;
}
public int getIdade(){
	return this.idade;
}
public int getQntCarros(){
	return this.qntCarros;
}
public void setQntCarros(int quantidade){
	this.qntCarros += quantidade;
}
public void setCpf(String cpf){
	this.cpf= cpf;
}

public String toString(){
	return "Nome: " + getNome() + "\n" +
			"CPF: " + getCpf() + "\n" +
			"Idade: " + getIdade();
}



}
