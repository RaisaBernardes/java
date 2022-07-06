package exercicio6_repositorio_bar;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
	
		Pedidos p1= new Pedidos("Fatia de torta", 9.00);
		Pedidos p2= new Pedidos("Empada", 7.50);
		Pedidos p3= new Pedidos("Ice", 6.90);
		Pedidos p4= new Pedidos("Água com gás", 4.50);
		
		Pedidos p5= new Pedidos("Taça de vinho tinto", 29.00);
		Pedidos p6= new Pedidos("Pão de queijo", 15.00);
		
		//System.out.println(p1.getPreco());
		
		
		ArrayList<Pedidos> mesa1= new ArrayList<>();
		mesa1.add(p1);
		mesa1.add(p2);
		mesa1.add(p3);
		mesa1.add(p4);
		
		
		
		ArrayList<Pedidos> mesa2= new ArrayList<>();
		mesa2.add(p5);
		mesa2.add(p6);
		
		Mesa m1= new Mesa(1, 2, mesa1);
		Mesa m2= new Mesa(2, 1, mesa2);
		
		
		
		RepositorioArrayListPedidos rp= new RepositorioArrayListPedidos();
		RepositorioArrayListMesa rm= new RepositorioArrayListMesa();
		
	
		rm.inserirMesa(m1);
		rm.inserirMesa(m2);
		
		for(Pedidos p: mesa1){
			rp.inserir(p);
		}
		
		for(Pedidos p: mesa2){
			rp.inserir(p);
		}
		
	
	
		System.out.println("Mesa: " + m1.getMesa());
		System.out.println(m1.getPedidos());
		System.out.println("---");
		System.out.println("Mesa: " + m2.getMesa());
		System.out.println(m2.getPedidos());
		
		//Testando Repositorio
		
		rm.removerMesa(m1);
		m1.getDisponibilidade();
		rm.procurarMesa(m1);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
