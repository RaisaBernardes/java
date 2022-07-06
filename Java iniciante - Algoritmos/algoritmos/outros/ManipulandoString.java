package outros;
import java.util.Scanner;

public class ManipulandoString {

	public static void main(String[] args) {
		
		String x = "Pernambuco";
		String y = x.substring(0,5);
		String z = x.substring(6,10);
		int indice = x.indexOf("na");
		char letra = x.charAt(5);
		
		System.out.println(x); 
		System.out.println(y);
		System.out.println(z); 
		System.out.println(indice);
		System.out.println(letra);

	}
}


	