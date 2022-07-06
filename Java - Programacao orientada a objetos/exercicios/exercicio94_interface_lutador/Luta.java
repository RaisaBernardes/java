package exercicio94_interface_lutador;
import java.util.Random;

public class Luta implements InterfaceLuta{

	private Lutador desafiante; //"vem de"
	private Lutador desafiado;
	private int round;
	private boolean aprovacao;
	private Lutador venceu;
	
	public Lutador getDesafiante(){
		return this.desafiante;
	}
	public void setDesafiante(Lutador dd){
		this.desafiante=dd;
	}
	public Lutador getDesafiado(){
		return this.desafiado;
	}
	public void setDesafiado(Lutador dd){
		this.desafiado=dd;
	}
	public boolean getAprovacao(){
		return this.aprovacao=true;
	}
	public void setAprovacao(boolean aprovacao){
		this.aprovacao=aprovacao;
	}
	public Lutador getVenceu(){
		System.out.println("VITORIA DE:  ");
		return this.venceu;
	}
	public void setVenceu(Lutador l){
		this.venceu=l;
	}
	@Override
	public void MarcarLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria())){
			setAprovacao(true);
			setDesafiado(l1);
			setDesafiante(l2);
			System.out.println("LUTA MARCADA!");
		
		}else{
			setAprovacao(false);
			setDesafiado(null);
			setDesafiante(null);
			System.out.println("Essa luta não pôde ser marcada!");
		}
		
	}
	@Override
	public void Luta() {
		if(getAprovacao()){
			
			System.out.println("ARE YOU READY TO RUMBLEEE???!!!!!");
		
			System.out.println("------- DESAFIADO------");
			desafiado.status();
		
			System.out.println("--------DESAFIANTE-----");
			desafiante.status();
		
			System.out.println("  ");
	
		Random aleatorio= new Random(); //sortear aleatoriamente
		int vencedor= aleatorio.nextInt(3); //vai gerar 3 resultados 0 1 2 
		
		switch(vencedor){
		
		case 0: //empatou
			System.out.println("Eita! Empatou!");
			this.desafiante.empatouLuta();
			this.desafiado.empatouLuta();
			
			break;
		case 1: //desafiante ganha
			setVenceu(desafiante);
			this.desafiante.ganhouLuta();
			this.desafiado.perdeuLuta();
			
			break;
		case 2: //desafiado ganha
			setVenceu(desafiado);
			this.desafiado.ganhouLuta();
			this.desafiante.perdeuLuta();
			
			break;
		}
		
		
		}else{
		System.out.println("Essa luta não pode acontecer!");
		}
		
	}

}
