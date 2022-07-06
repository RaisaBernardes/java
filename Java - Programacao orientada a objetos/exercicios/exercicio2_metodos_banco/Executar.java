package exercicio2_metodos_banco;
import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Conta c= new Conta();
		c.setDono("Ricardo");
		c.setTipo("cc");
		c.setNumConta(111);
		c.setSaldo(50);
		c.setStatus(true);
		
		c.Informacoes();
	
	}

}
