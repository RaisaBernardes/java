package _1K_printf;

public class ExemploPrintf { 
	//O printf não é muito usado na vida real e é um atalho do system.out.format(). 
	//Na vida real utilizamos a classe java.util.Formarter para fazer isso.  

	public static void main(String[] args) {

		//System.out.println(format, args);
		System.out.printf("%s", "Olá, Mundo!"); //%s -> é para indicar que o formato passado será uma string
		System.out.println(); //para o cursor pular de linha
		System.out.printf("%S", "Olá, Mundo!"); //S% -> Indica formato string e imprime tudo em CAIXA ALTA.
		System.out.println();

		System.out.printf("%c", 'c'); //Para formatar apenas 1 caracter usamos o %c
		System.out.println();
		System.out.printf("%C", 'c'); //Imprime caracter em CAIXA ALTA

		System.out.printf("%n"); //O "/n" não é uma boa prática, então para o cursor pular de linha deve-se utilizar o "%n"

		int valor = 123456789;
		System.out.printf("%d", valor); //%d é para números inteiros.

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); //%f para ponto flutuante.

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); //Esse "20" representa 20 caracteres em branco à esquerda.

		System.out.println();

		System.out.printf("%-20s", olaMundo); //20 caracteres à direita

		System.out.println();

		System.out.printf("%+d", valor); //Imprime o + na frente do número

		System.out.println();

		System.out.printf("%015d", valor); //O valor deverá ter 15 dígitos e completará com zeros à esquerda

		System.out.println();

		System.out.printf("%,d", valor); //separa os milhares com vírgula. (Em pt-BR usar ponto para números.)
		
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); //Se tiver um sinal de - ou + vai imprimir normal
		System.out.println();
		System.out.printf("% d", valor); //Sem sinais antes do número ele imprime um espaço antes do número

		System.out.println();

		System.out.printf("%.3f", pontoFlutuante); //Faz o arredondamento para 3 casas decimais.

		System.out.println();

		System.out.printf("R$%10.2f", pontoFlutuante); //espaço de 10 caracteres e precisão de 2 números.

		System.out.println();

		testeMaisCompleto();
	}
	
	//Método para fazer saída formatada
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
			//A formação é na ordem. 
			//s% -> item    |    %02d -> i+1   |    R$%,10.2f%n -> preços[i]
		}
		
	}

}