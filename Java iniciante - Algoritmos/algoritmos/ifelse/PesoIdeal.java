package ifelse;
import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float ANO;
		float ANOATUAL;
		float IDADE;
		
		System.out.println("Informe ano atual: ");
		ANOATUAL = sc.nextFloat();
		
		System.out.println("Informe seu ano de nascimento: ");
		ANO = sc.nextFloat();
		
		IDADE = ANOATUAL - ANO;
		
		System.out.println(IDADE + " anos de idade");
		
		if (IDADE >= 16 && IDADE < 18) {
			System.out.println("  Você já pode votar! ");
		
		} else if (IDADE < 16) {
			System.out.println(" Você ainda não pode votar! ");
		} else {
			System.out.println(" Você atingiu idade necessária para tirar carteira de habilitação! \n Voto obrigatório." );
		}
		
	}
}
