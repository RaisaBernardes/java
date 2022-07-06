//Ler preço de compra e venda de 100 mercadorias e imprimir quantidade de mercadorias que proporcionam lucros < 10%
// lucro > 20%, lucro entre 20% e 10% 
package vetores;

import java.util.Scanner;

public class Lucro {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int quantidade = 100;
	double compra[] = new double[quantidade];
	double venda[] = new double [quantidade];
	double lucro[] = new double [quantidade];
	int cont= 0;
	int cont1= 0;
	int cont2= 0;
	
	for(int i= 0; i< quantidade; ++i){
		System.out.println("Informe preço de compra do " + (i+1) + "º produto: ");
		compra[i] = sc.nextDouble();
		
		System.out.println("Informe preço de venda do " + (i+1) + "º produto: ");
		venda[i] = sc.nextDouble();
	
		lucro[i] = venda[i] - compra[i]; 
	
			if (((lucro[i] * 100)/ compra[i] ) < 10){
				++cont;
			}else if (((lucro[i] * 100)/ compra[i]) > 20){
				++cont1;
			}else{
				++cont2;
			}
	}
		System.out.println(cont + " mercadorias proporcionam lucro < 10% ");
		System.out.println(cont2 + " mercadorias proporcionam lucro entre 10% e 20% ");
		System.out.println(cont1 + " mercadorias proporcionam lucro > 20% ");
	}
}
