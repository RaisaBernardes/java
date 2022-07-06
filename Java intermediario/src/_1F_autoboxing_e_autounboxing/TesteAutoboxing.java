package _1F_autoboxing_e_autounboxing;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing -> Processo de transformar um tipo primitivo em um objeto.
		//Atribui o valor diretamente (funciona a partir do java5)
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l; //new Long(10000l);
		Float num11 = 3.5f; //new Float(3.5f);
		Double num12 = 2.55555;
		Boolean flag2 = true;
		Character b_ = 'b';

		//auto un-boxing -> Transformar um tipo de uma classe em um tipo primitivo novamente.
		int num13 = num9; //� a mesma coisa que fazer num9.intValue();
		
		//autoboxing em express�es
		num9++;
		
		System.out.println(num9);
		
		Integer num14 = num13/num9; //O num13 j� � numero primitivo, ent�o � feito o auto unboxing do num9, e depois �
									//feito o autoboxing da express�o num13/num9 para o num14
		
		//mau uso
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c)/3; //1� � feito um unboxing e depois um autoboxing quando atribui o resultado a variavel "media"
		System.out.println(media);
		
		//Se for trabalhar com muitas express�es assim, � melhor trabalhar com os n�meros diretamente primitivos e se precisar, 
		//depois fazer o autoboxing. 
	}

}
