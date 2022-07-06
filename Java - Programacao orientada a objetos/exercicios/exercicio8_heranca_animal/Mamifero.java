package exercicio8_heranca_animal;

public class Mamifero extends Animal{

	protected String corPelo;

	@Override
	public void EmitirSom(){
		System.out.println("Emitindo Som Mamifero!");
	}

}
