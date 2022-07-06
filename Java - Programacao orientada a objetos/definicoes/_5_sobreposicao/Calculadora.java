/*A sobrecarga permite que m�todos diferentes tenham o mesmo nome, mas assinaturas diferentes, onde a assinatura pode 
diferir pelo n�mero de par�metros de entrada ou tipo de par�metros de entrada ou ambos. A sobrecarga est� relacionada 
ao polimorfismo em tempo de compila��o (ou est�tico).

Vantagem: N�o precisamos criar e lembrar nomes diferentes para fun��es que fazem a mesma coisa.

*/


package _5_sobreposicao;

public class Calculadora {

	public int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public double soma(double num1, double num2){
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public int soma(int[] vetorInteiros){
		
		int total = 0;
		
		for (int i=0; i<vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		
		return total;
	}
}