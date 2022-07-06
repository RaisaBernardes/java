package exercicio1_objeto_caneta;

public class Executar {

	public static void main(String[] args) {
		
		Caneta c1= new Caneta(0.5f, "BIC", "AZUL");
		c1.status();
		
		Caneta c2= new Caneta(0.7f, "Faber Castel", "ROSA");
		c2.status();
		
		System.out.println("Tenho uma caneta "+ c1.getModelo());
		
	}

}
