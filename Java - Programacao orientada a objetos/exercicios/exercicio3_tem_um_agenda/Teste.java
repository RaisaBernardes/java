package exercicio3_tem_um_agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);	
	
	System.out.println("Entre com o nome da agenda: ");
	String nome= sc.next();
	
	Agenda agenda= new Agenda(nome);
	ArrayList <Contatos> contato = new ArrayList<>();
	
		for(int i=0; i< contato.size(); i++){
			
			System.out.println("Entre com as informações do contato: ");
			Contatos C= new Contatos();
			
			System.out.println("Entre com o nome do contato " );
			String nomeC= sc.next();
			C.setNome(nomeC);
			
			System.out.println("Entre com o telefone do contato: " );
			String telefone = sc.next();
			C.setTelefone(telefone);
		
			System.out.println("Entre com o email do contato: " );
			String email = sc.next();
			C.setEmail(email);
		
			contato.add(C);
			
		}
	}
}
