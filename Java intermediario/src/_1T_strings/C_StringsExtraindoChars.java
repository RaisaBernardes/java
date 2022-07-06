package _1T_strings;

import java.util.Arrays;

public class C_StringsExtraindoChars {

	public static void main(String[] args) {
			
			String java = "Java";
			
			//Imprimindo um caracter por vez
			for (int i=0; i<java.length(); i++){ //Podemos usar o .length() pois uma String � um array de caracteres.
				System.out.println(java.charAt(i));
			}
	
			//Imprimindo os 3 primeiros caracteres da string "Java"
			char[] jav = new char[3];
			java.getChars(0, 3, jav, 0); 
			// (posi��o do 1� caracter, posi��o do �ltimo caracter a partir de 1, para qual destino os caracteres ser�o transferidos, a partir de qual �ndice do array quero copiar)
			System.err.println(jav);
			
			//seria o mesmo que
			for (int i=0, j=0; i<3; i++, j++){
				jav[j] = java.charAt(i); //O m�todo ".charAt() � o mais �til no dia a dia.
			}
			System.out.println(jav);
			
			
			//O "Byte" funciona da mesma forma que char
			byte[] javBytes = new byte[3];
			java.getBytes(0, 3, javBytes, 0);
			System.out.println(Arrays.toString(javBytes)); //vai imprimir os caracteres da variavel "java" em modelo ascii
			
			
			//Transformar uma string em um array de chars.
			char[] javaChars = java.toCharArray();
			System.out.println(javaChars);
		}

	
}
