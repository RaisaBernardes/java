/*A sobrecarga permite que métodos diferentes tenham o mesmo nome, mas assinaturas diferentes, onde a assinatura pode 
diferir pelo número de parâmetros de entrada ou tipo de parâmetros de entrada ou ambos. A sobrecarga está relacionada 
ao polimorfismo em tempo de compilação (ou estático).

Vantagem: Não precisamos criar e lembrar nomes diferentes para funções que fazem a mesma coisa.

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