package _1T_strings;

public class B_StringsConcatenacao {

	//Concatenação de Strings -> Junção de strings
	
	public static void main(String[] args) {

		String curso = "Curso ";
		String java = "Java";

		String cursoJava = curso + java;

		System.out.println(cursoJava);

		//É possivel fazer concatenação de outros tipos com uma string
		String resultado2Com2 = "Resultado 2+2 = " + (2+2); //com os parêntesis (2+2) o compilador vai somar -> "4".
		System.out.println(resultado2Com2);

		String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2; //Sem os parêntesis (2+2) o compilador vai fazer 
															 //a junção dos números -> "22".
		System.out.println(resultado2Com2_);

		String um = String.valueOf(1); //Esse "1" será transformado em string (Não é numérico).
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
				"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
				"minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " + 
				"commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " + 
				"essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " + 
				"non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

		System.out.println(concatenacao);

		//fazer concatenação assim é uma má prática no java e altera na performance
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
		concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
		concatenacao2 += "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
		concatenacao2 += "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
		concatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		//Ao final de todas as concatenações, a variável "concatenação2" terá uma referêcia diferente da primeira vez
		//que lhe foi atribuído um valor.
	
		System.err.println(concatenacao2);
		
		//RESULTADO: 
		//As strings no java são IMUTÁVEIS, ou seja, seu valor não muda. Quando fazemos uma concatenação ou estamos
		//"mudando" o valor de uma string, estamos criando uma nova string com um novo id. Após a "criação" dessa string, o Garbadge Collector
		//entra em ação liberando a referência anterior dessa variavel.
		
	
	}
	
}
