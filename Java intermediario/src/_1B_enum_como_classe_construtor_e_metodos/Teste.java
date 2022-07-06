package _1B_enum_como_classe_construtor_e_metodos;


public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
		
		
		//--------M�TODO value();----------
		
		//Visto que enums s�o (de forma grosseira) uma cole��o de constantes, para obter todos esses valores, utilizamos
		//o m�todo values();
		DiaSemana[] dias = DiaSemana.values();
		
		//1� maneira de imprimir
		for (int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		//2� maneira de imprimir
		for (DiaSemana dia2: DiaSemana.values()) {
			System.out.println(dia2);
		}
		
		
		//--------M�TODO valueOf();----------
		
		//Se eu n�o souber qual � o enumerador que eu quero atribuir o dia da semana, mas eu tiver o valor numa string, 
		//eu posso avaliar o valor dessa string transformando ela numa pr�pria inst�ncia de um enumerador.
		DiaSemana dia3 = Enum.valueOf(DiaSemana.class, "DOMINGO"); //Ele retorna um pr�prio enumador
		System.out.println(dia3);
	}
	

}