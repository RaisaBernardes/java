package _1G_importacao_estatica;

import static java.lang.Math.pow; 
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; //Importa todos os m�todos da classe Math, por�m � mais elegante importar separadamente o que ser� utilizado como est� acima

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;

		//Todos os m�todos da classe Math s�o est�ticos (n�o precisamos instanciar para utilizar os m�todos)
		
		System.out.println(Math.pow(a, b)); //metodo de pot�ncia
		
		System.out.println(Math.sqrt(c)); //m�todo de raiz quadrada
	
		//Como j� est� declarado o "import static java.lang.Math.pow;" la em cima, eu posso usar o "pow" diretamente.
		//Utiliza-se isso, por exemplo, quando eu vou utilizar muitos m�todos de uma classe espec�fica. Isso economiza o c�digo
		//Nesse caso, se eu fosse fazer uma calculadora cientifica, seria vi�vel utilizar os imports est�ticos da classe Math
		
		System.out.println(pow(a, b));
		
		System.out.println(sqrt(c));
		
		
	}

}