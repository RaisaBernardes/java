package exercicio93_interface_controle_remoto;

public class Teste {

	public static void main(String[] args) {
		
		Controle c1= new Controle(4, true, false, 13);
		
		System.out.println(c1.getCanal());
		System.out.println(c1.getStatus());
		System.out.println(c1.getTocando());
		System.out.println(c1.getVolume());
		
		System.out.println("------------------");
		
		c1.Ligar();
		c1.MudarCanal(13);
		c1.DiminuirVolume();
		c1.DiminuirVolume();
		c1.Play();
		c1.Pausar();
	}

}
