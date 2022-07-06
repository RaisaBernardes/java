package _1B_enum_como_classe_construtor_e_metodos;


public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
		
		
		//--------MÉTODO value();----------
		
		//Visto que enums são (de forma grosseira) uma coleção de constantes, para obter todos esses valores, utilizamos
		//o método values();
		DiaSemana[] dias = DiaSemana.values();
		
		//1ª maneira de imprimir
		for (int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		//2ª maneira de imprimir
		for (DiaSemana dia2: DiaSemana.values()) {
			System.out.println(dia2);
		}
		
		
		//--------MÉTODO valueOf();----------
		
		//Se eu não souber qual é o enumerador que eu quero atribuir o dia da semana, mas eu tiver o valor numa string, 
		//eu posso avaliar o valor dessa string transformando ela numa própria instância de um enumerador.
		DiaSemana dia3 = Enum.valueOf(DiaSemana.class, "DOMINGO"); //Ele retorna um próprio enumador
		System.out.println(dia3);
	}
	

}