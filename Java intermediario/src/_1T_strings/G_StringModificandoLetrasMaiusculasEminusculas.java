package _1T_strings;

public class G_StringModificandoLetrasMaiusculasEminusculas {

	//Como transformar caracteres de uma string em letras mai�sculas ou min�sculas usando o (toLowerCase, toUpperCase)
	//S�o muito �teis quando precisamos de um padr�o, por exemplo, em um formul�rio
	
	public static void main(String[] args) {
			
			String teste = "Teste";
			
			String testeMinusc = teste.toLowerCase();
			String testeMaisc = teste.toUpperCase();
	
			System.out.println(testeMinusc);
			System.out.println(testeMaisc);
			
			//if (teste.toLowerCase().equals(teste.toLowerCase())) //-->> � a mesma coisa que usar o equalsIgnoreCase
		}
}
