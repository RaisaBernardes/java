package exercicio94_interface_lutador;

public class Lutador implements Interface {


	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
	
		this.nome=no;
		this.nacionalidade=na;
		this.idade=id;
		this.altura=al;
		this.setPeso(pe);
		this.vitorias=vi;
		this.derrotas=de;
		this.empates=em;
	
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public int getIdade() {
		return idade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public String getNome() {
		return nome;
	}
	public double getPeso() {
		return peso;
		
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setCategoria() {
		if(getPeso() < 52.0){
			System.out.println("Invalido!");
		} else if(getPeso() <= 70.0){
			this.categoria = "LEVE";
		} else if(getPeso() <= 90.0){
			this.categoria = "MEDIO";
		} else if(getPeso() <= 120.0){
			this.categoria = "PESADO";
		} else {
			System.out.println("Inválido por sobrepeso!");
		}
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	@Override
	public void apresentar() {
		System.out.println("Esse é o lutador " + getNome());
		System.out.println("Veio de " + getNacionalidade());
		System.out.println("Pesando "+ getPeso());
		System.out.println("Medindo " + getAltura() + " de altura");
		System.out.println("Já ganhou " + getVitorias() + " lutas!");
		
	}
	
	@Override
	public void status() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Peso: "+ getPeso());
		System.out.println("Vitorias: " + getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empates: " + getEmpates());
		
	}
	
	@Override
	public void ganhouLuta() {
		setVitorias(getVitorias() + 1);
		
	}
	
	@Override
	public void perdeuLuta() {
		setDerrotas(getDerrotas() + 1);
		
	}
	
	@Override
	public void empatouLuta() {
		setEmpates(getEmpates() + 1);
		
	}

}
