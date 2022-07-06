//-----------MATRIZ TRIDIMENSIONAL------------( Ao inv�s de tabelas, trabalhamos com cubos.)
//Exercicio: Crie uma matriz tridimensional 3x3x3 onde cada elemento da matriz seja igual a soma de seus indices. Exemplo: M[1,2,1] = 1+2+1 = 4
//Obtenha a soma de todos os elementos da matriz, e obtenha a soma dos elementos cujos valroes s�o pares, e a soma dos elementos
//cujos valores s�o �mpares. Exibir na tela os valores da soma total, soma dos pares e soma dos �mpares.
package matrizes;

public class Matrizes2 {

public static void main(String[] args) {
		
		int[][][] matrizTridimensional = new int[3][3][3];

		
		//Ter muitos "for"s um dentro do outro prejudica a performance, no entanto, se tratando de uma matriz tridimensional 
		//essa � a �nica forma de interagir com ela.
		for (int i=0; i<matrizTridimensional.length; i++){
			for (int j=0; j<matrizTridimensional[i].length; j++){
				for (int k=0; k<matrizTridimensional[i][j].length; k++){
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int i=0; i<matrizTridimensional.length; i++){
			for (int j=0; j<matrizTridimensional[i].length; j++){
				for (int k=0; k<matrizTridimensional[i][j].length; k++){
					
					soma += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] % 2 == 0){
						somaPares += matrizTridimensional[i][j][k];
					} else {
						somaImpares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma pares = " + somaPares);
		System.out.println("Soma impares = " + somaImpares);
	}
}
