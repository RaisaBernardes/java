package matrizes;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Informe o tamanho das linhas: ");
			int linhas= sc.nextInt();
			
			System.out.println("Informe o tamanho das colunas: ");
			int colunas= sc.nextInt();
			
			
			int[][]a= new int[linhas][colunas];
			int[][]b= new int[linhas][colunas];
			int[][]c= new int[linhas][colunas];
			int[][]d= new int[linhas][colunas];
			
			
			for(int i=0; i<a.length; ++i){
				for(int j=0; j< a[i].length; ++j){
					System.out.println("Escreva o " + (1+j) + "º elemento da linha " + i + " da matriz A");
					a[i][j]= sc.nextInt();
	
				}
			}
			
			for(int i=0; i<a.length; ++i){
				for(int j=0; j< a[i].length; ++j){
					System.out.println("Escreva o " + (1+j) + "º elemento da linha	 " + i + " da matriz B");
					b[i][j]= sc.nextInt();
			
				}
			}
			
			for(int i=0; i<a.length; ++i){
				for(int j=0; j< a[i].length; ++j){
			
					c[i][j]= a[i][j] + b[i][j];
			
				}
			}
			
			for(int i=0; i<a.length; ++i){
				for(int j=0; j< a[i].length; ++j){
				System.out.print(a[i][j] + "\t");
				
				}
				System.out.println();
			}
			System.out.println();
			
			for(int i=0; i<a.length; ++i){
				for(int j=0; j< a[i].length; ++j){
				System.out.print(b[i][j] + "\t");
				
				}
				System.out.println();
			}
			System.out.println();
			
			for(int i=0; i<a.length; ++i){
				for(int j=0; j< a[i].length; ++j){
				System.out.print(c[i][j] + "\t");
				
				}
				System.out.println();
			}
			
	}
}
