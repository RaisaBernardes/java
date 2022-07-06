package exercicio8_heranca_animal;

public class Principal {

	public static void main(String[] args) {
			
		Lobo x= new Lobo();
		Cachorro c= new Cachorro();
		
		c.EmitirSom();
		
		x.EmitirSom();
			
		c.Reagir(false);
		c.Reagir(2,5);

	}

}
