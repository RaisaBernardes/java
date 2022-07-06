package _1U_classes_utilitarias_java;


import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class _92_NumberFormat {
	
	//Utilizamos quando queremos formatar n�meros mas n�o temos muita necessidade da precis�o decimal.
	//Quando trabalhamos com moedas a formata��o vai variar de acordo com o pa�s.
	

	public static void main(String[] args) throws ParseException {
		
		// 1.000,00 - Brasil
		// 1,000.00 - EUA
		
		
		//Formato americano
		Locale en = new Locale("en", "United States"); //O "United States" � apenas uma descri��o
		NumberFormat nf = NumberFormat.getInstance(en);
		
		String num = nf.format(100.99); //100 inteiros e 99 de casas decimais
		System.out.println(num);
		
		//Formato brasileiro
		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(100.99);
		System.out.println(num);
		
		// MOEDA
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		
		String valor = moeda.format(100.99);
		System.out.println(valor);
		
		
		Currency currency = moeda.getCurrency(); //Currency � do pacote java.util
		System.out.println(currency);
		
		// PORCENTAGEM
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987); //transformando esse numero em porcentagem
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(7); //M�ximo de digitos de casas inteiras
		porcent.setMinimumIntegerDigits(5); //M�nimo
		
		porcent.setMaximumFractionDigits(2); //M�ximo de digitos de casas decimais
		porcent.setMinimumFractionDigits(1); //M�nimo
		
		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		// ARREDONDAMENTO
		
		nf = NumberFormat.getInstance(Locale.getDefault());
		
		nf.setRoundingMode(RoundingMode.UP); //Arredondando pra cima
		nf.setMaximumFractionDigits(0); //Configurando nenhuma casa decimal
		nf.setMinimumFractionDigits(0); //Configurando nenhuma casa decimal
		System.out.println(nf.format(99.50));
		
		Number num3 = nf.parse("100.00"); //Prestar aten��o na config do Locale para escrever , ou . de forma correta 
		System.out.println(num3.intValue());
	}

	
}
