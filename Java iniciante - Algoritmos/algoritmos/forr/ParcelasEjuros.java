package forr;
//Informar quantidade de parcelas, juros real, e valor final usando "for".
import java.util.Scanner;

public class ParcelasEjuros {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		double valorFinanciado;
		double juros;
		double valorParcelas;
		int quantidadeDeParcelas;
		double valorFinal = 0;
		
		
		System.out.println("Informe o valor do financiamento: ");
		valorFinanciado = s.nextDouble();
		
		System.out.println("Informe a taxa de juros: ");
		juros = s.nextDouble();
		
		System.out.println("Informe a quantidade de parcelas: ");
		quantidadeDeParcelas = s.nextInt();
		
		valorParcelas = (valorFinanciado / quantidadeDeParcelas) * (1 + (juros/100));

		
		for(int cont = 0; cont < quantidadeDeParcelas; ++cont) {
		valorFinal += valorParcelas;
		}

			System.out.println("O valor da parcela é: R$" + valorParcelas);
			System.out.println("O valor final a ser pago é: R$" + valorFinal);
			System.out.println("O valor total de juros foi de: R$" + (valorFinal - valorFinanciado) );

	}

}
