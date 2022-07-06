package matrizes;
//Identificar quais são os números iguais em vetores diferentes.
public class Exercicio5 {

	public static void main(String[] args) {
		
		int[][]matriz= {{1,2,3},{6,8,6},{1,8,9}};
		int cont=0;
				
		do{
		
			for(int i=cont+1; i<matriz.length; ++i){
						
				for(int j=0; j<matriz.length; ++j){
								
					if(matriz[cont][j]== matriz[i][j]){
									
						System.out.println(matriz[i][j]);
					}
				}
			} cont++;
		}while(cont < matriz.length);
	
	}
}
