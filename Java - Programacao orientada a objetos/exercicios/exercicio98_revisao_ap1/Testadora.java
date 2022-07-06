package exercicio98_revisao_ap1;
import java.util.Scanner;

public class Testadora {

	public static void main(String[] args){
		
	Scanner sc= new Scanner(System.in);	

	Fachada fachada= new Fachada();
	
	
	Cliente cliente1= new Cliente("A", "1111111", 20);
	Cliente cliente2= new Cliente("B", "2222222", 30);
	Cliente cliente3= new Cliente("C", "3333333", 40);
	Cliente cliente4= new Cliente("D", "4444444", 44);
	Cliente cliente5= new Cliente("E", "5555555", 15);
	
	Carro carro1= new Carro("C1", cliente1);
	Carro carro2= new Carro("C2", cliente1);
	Carro carro3= new Carro("C3", cliente2);
	Carro carro4= new Carro("C4", cliente4);
	Carro carro5= new Carro("C5", cliente4);
	Carro carro6= new Carro("C6", cliente4);
	Carro carro7= new Carro("C7", cliente4);
	Carro carro8= new Carro("C8", cliente5);
	Carro carro9= new Carro("C9", cliente5);
	Carro carro10= new Carro("C10", cliente5);
	
	try{
	
		fachada.adicionarCliente(cliente5);
		fachada.adicionarCarro(carro1);
		fachada.cadastrarCarro(carro1);
	
	}catch(ClienteJaCadastradoException x){
		System.out.println("Cliente já é cadastrado...");
		
	}catch(CarroJaCadastradoException y){
		System.out.println("Carro já cadastrado...");
		
	}catch(IdadeMinimaNaoPermitidaException z){
		System.out.println("Idade não permitida...");
		
	}catch(NumeroMaximoDeCarrosException w){
		System.out.println("Atingiu o número maximo de carros!");
		
	}
	
	
	
	
	
	
	
	
	}

}
