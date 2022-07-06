package exercicio2_metodos_banco;

public class Conta {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public Conta(){
		this.setSaldo(0);
		this.setStatus(false);	
	}

	public int getNumConta(){
		return this.numConta;
	}
	public void setNumConta(int numConta){
		this.numConta = numConta;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setTipo(String tipo){
		this.tipo= tipo;
	}
	public String getDono(){
		return this.dono;
	}
	public void setDono(String dono){
		this.dono=dono;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void setSaldo(double saldo){
		this.saldo= saldo;
	}
	public boolean getStatus(){
		return this.status;
	}
	public void setStatus(boolean status){
		this.status = status;
	}


	public void AbrirConta(String t){
		
		this.setStatus(true);
		this.setTipo(t);
		
		if(getTipo().equalsIgnoreCase("CP")){
			this.setSaldo(50);
		
		}else if(getTipo().equals("CC")){
			this.setSaldo(150);
		}
	}

	public void FecharConta(){
		
		if(getSaldo()==0){
			setStatus(false);
			
			System.out.println("Conta encerrada com sucesso!");
		
		}else if(getSaldo() > 0){
			System.out.println("Impossivel encerrar conta com saldo");
		}else{
			System.out.println("Impossivel encerrar conta com debito");
		}
	}
	
	public void Depositar(double v){
		if(getStatus() != false){
			setSaldo(getSaldo() + v);
		}else{
			System.out.println("Essa conta não existe!");
		}
	}

	public void Sacar(double s){
		if(getStatus() != false){
			if(getSaldo() >= s){
				setSaldo(getSaldo() - s);
			}else{
				System.out.println("Saldo insuficiente!");
			}
		}else{
			System.out.println("Essa conta não existe!");
		}
	}

	public void PagarMensal(double mensalidade){
		
		if(getStatus() == true){
			if(getTipo().equalsIgnoreCase("CC")){
				mensalidade = 15;
				setSaldo(getSaldo() - mensalidade);
				
			}else if(getTipo().equalsIgnoreCase("CP")){
				mensalidade = 20;
				setSaldo(getSaldo() - mensalidade);	
			}
		} 
	}

	public void Informacoes(){
		System.out.println("TITULAR:  " + getDono());
		System.out.println("TIPO:  " + getTipo());
		System.out.println("SALDO:  " + getSaldo());
		System.out.println("NUMERO DA CONTA:  " + getNumConta());
	}

}