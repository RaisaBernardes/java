package arraylist;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		

	ArrayList<Pessoa> pessoas= new ArrayList<Pessoa>();
	
	Pessoa p1= new Pessoa("Joao", "12344321", 20);
	Pessoa p2= new Pessoa("Mariana", "78987655", 33);
	Pessoa p3= new Pessoa("Lucia", "06899756", 41);
	Pessoa p4= new Pessoa("Raisa", "9809888", 25);
	
	pessoas.add(p1);
	pessoas.add(p2);
	pessoas.add(p3);
	pessoas.add(p4);
	
	for(Pessoa p: pessoas){
		System.out.print(p.getNome() + " ");
		System.out.print(p.getCpf() + "  ");
		System.out.print(p.getIdade() + " ");
		System.out.println();	
	}
	
	}
}
