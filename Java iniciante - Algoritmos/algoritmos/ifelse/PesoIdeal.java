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
			System.out.println("  Voc� j� pode votar! ");
		
		} else if (IDADE < 16) {
			System.out.println(" Voc� ainda n�o pode votar! ");
		} else {
			System.out.println(" Voc� atingiu idade necess�ria para tirar carteira de habilita��o! \n Voto obrigat�rio." );
		}
		
	}
}
