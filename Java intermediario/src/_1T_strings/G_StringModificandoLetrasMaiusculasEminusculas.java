package _1T_strings;

public class G_StringModificandoLetrasMaiusculasEminusculas {

	//Como transformar caracteres de uma string em letras maiúsculas ou minúsculas usando o (toLowerCase, toUpperCase)
	//São muito úteis quando precisamos de um padrão, por exemplo, em um formulário
	
	public static void main(String[] args) {
			
			String teste = "Teste";
			
			String testeMinusc = teste.toLowerCase();
			String testeMaisc = teste.toUpperCase();
	
			System.out.println(testeMinusc);
			System.out.println(testeMaisc);
			
			//if (teste.toLowerCase().equals(teste.toLowerCase())) //-->> É a mesma coisa que usar o equalsIgnoreCase
		}
}
