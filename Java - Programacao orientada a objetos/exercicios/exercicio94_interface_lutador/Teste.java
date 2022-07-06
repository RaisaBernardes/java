package exercicio94_interface_lutador;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Lutador> lutador= new ArrayList<Lutador>();
		
		Lutador l1= new Lutador("Marcos", "Brasil", 30, 1.80, 89.0, 1, 3, 2);
		Lutador l2= new Lutador("Luiz", "França", 24, 1.76, 60.5, 6, 4, 1 );
		Lutador l3= new Lutador("José", "Irlanda", 29, 1.98, 95.6, 1, 4, 2);
		Lutador l4= new Lutador("Julio", "Guiné", 40, 1.54, 90.0, 8,9,0);
		
		lutador.add(l1);
		lutador.add(l2);
		lutador.add(l3);
		lutador.add(l4);
		
		for(Lutador v: lutador){
			v.apresentar();
			System.out.println(" ");
			System.out.println("-----------------");
			System.out.println(" ");
		}
		
		Luta UFC1 = new Luta(); //tenho que criar um objeto do tipo luta para pegar
								//as informações da classe luta...
		
		UFC1.MarcarLuta(l1, l4);
		UFC1.Luta();
		System.out.println(UFC1.getVenceu());
		
		
		System.out.println("-----");
		
		l1.status();
		System.out.println("-----");
		
		l4.status();
	
	}

}
