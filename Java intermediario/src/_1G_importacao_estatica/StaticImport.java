package _1G_importacao_estatica;

import static java.lang.Math.pow; 
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; //Importa todos os métodos da classe Math, porém é mais elegante importar separadamente o que será utilizado como está acima

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;

		//Todos os métodos da classe Math são estáticos (não precisamos instanciar para utilizar os métodos)
		
		System.out.println(Math.pow(a, b)); //metodo de potência
		
		System.out.println(Math.sqrt(c)); //método de raiz quadrada
	
		//Como já está declarado o "import static java.lang.Math.pow;" la em cima, eu posso usar o "pow" diretamente.
		//Utiliza-se isso, por exemplo, quando eu vou utilizar muitos métodos de uma classe específica. Isso economiza o código
		//Nesse caso, se eu fosse fazer uma calculadora cientifica, seria viável utilizar os imports estáticos da classe Math
		
		System.out.println(pow(a, b));
		
		System.out.println(sqrt(c));
		
		
	}

}