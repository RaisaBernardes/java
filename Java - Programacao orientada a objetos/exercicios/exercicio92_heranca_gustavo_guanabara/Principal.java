package exercicio92_heranca_gustavo_guanabara;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Video[] v = new Video[3];
		v[0]= new Video("Aula POO");
		v[1]= new Video("Aula PHP");
		v[2]= new Video("Aula Algoritmo");
		
		Gafanhoto[]g = new Gafanhoto[3];
		g[0]= new Gafanhoto("gafanhoto1@gmail.com");
		g[1]= new Gafanhoto("gafanhoto2@gmail.com");
		g[2]= new Gafanhoto("gafanhoto3@gmail.com");
		
		Visualizacao[]vis= new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[1]);
		vis[1] = new Visualizacao(g[2], v[2]);

		v[1].setReproduzindo(true);
		v[1].like("sim");
		
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		
	}

}
