package exercicio1_objeto_caneta;

public class Caneta {

	private	float ponta;
	private String modelo;
	private String cor;
	private boolean tampada;
	
	
	public Caneta(float p, String m, String c){ // Metodo construtor
		this.ponta= p;
		this.modelo= m;
		this.cor= c;
		
	}
	
	public void status(){
		System.out.println("Cor: " + getCor());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ponta: " + getPonta());
		
			if(this.tampada == true){
				tampar();
			}else{
				destampar();
		}
	}
	
	public float getPonta(){
		return this.ponta;
	}

	public void setPonta(float ponta){
		this.ponta= ponta;
	}

	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo= modelo;
	}

	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor= cor;
	}
	
	public void tampar(){
		this.tampada = true;
		
		System.out.println("Caneta TAMPADA");
	}

	public void destampar(){
		this.tampada= false;
		
		System.out.println("Caneta DESTAMPADA");
	}
}
