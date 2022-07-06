package matrizes;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int valor[][] = {{1,2,3}, {4,5,6} ,{7,8,9}};
		
		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor.length; j++) {
				System.out.print( valor[i][j] + " - ");
			}
			System.out.println(" ");
				
		} 
	}
}


