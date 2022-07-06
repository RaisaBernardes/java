package exercicio3_tem_um_agenda;
import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contatos> contatos;
	private String nome;
	
	
	public Agenda(String nome){
		this.nome= nome;
		this.contatos= contatos;
	}
	
	
	public ArrayList<Contatos> getContatos() {
		return contatos;
	}
	public void setContatos(ArrayList<Contatos> contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
	public String ObterInfo(){
		String info= "Agenda: " + this.nome;
		
		if(contatos != null){
			for(Contatos c: contatos){
				info += c.ObterInfo();
			}
		}
		return info;
	}


}
