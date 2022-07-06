/* --------MODIFICADOR FINAL--------
 
O modificador final � usado em diferentes contextos:
- Final vari�vel -> Para criar uma vari�vel CONSTANTE
- Final m�todo   -> Para evitar o overriding de um m�todo
- Final classe   -> Para evitar "filhos" dessa classe
	
---FINAL EM VARI�VEIS---:
- O valor n�o poder� ser modificado
- Toda constante deve ser inicializada ao ser criada (atribuir um valor a ela)

Obs.: uma vari�vel final n�o pode ser reatribu�da. Mas no caso de uma vari�vel final de refer�ncia, o estado interno 
do objeto apontado por essa vari�vel de refer�ncia pode ser alterado. (Ver exemplo na classe "Teste")

---FINAL EM CLASSES---:
Todas as classes wrapper como Integer, Float, etc s�o classes finais.
1� situa��o de uso -> Evitar heran�a
2� situa��o de uso -> O outro uso de final with classes � criar uma classe imut�vel como a classe String predefinida.
(N�o se pode tornar uma classe imut�vel sem torn�-la final.)

---FINAL EM M�TODOS---:
Um m�todo final n�o pode ser substitu�do (Overriding). A classe Object faz isso � v�rios de seus m�todos s�o finais. 
Devemos declarar m�todos com a palavra-chave final quando queremos seguir a mesma implementa��o em todas as classes 
derivadas.
					  
*/


package _9_modificadorFinal;

public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	private String telefoneCelular;
	
	public Pessoa() {}
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	//public abstract String obterEtiquetaEndereco();
	
	//public abstract void imprimirEtiquetaEndereco();
}