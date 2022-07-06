package _1U_classes_utilitarias_java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class _93_DecimalFormat { 
	
	//Utilizamos o DecimalFormat quando precisamos de mais precis�o
	//Essa classe extende a NumberFormat
	
	public static void main(String[] args) {
			
			String padrao = "###,###.##"; //padrao americano
			DecimalFormat df = new DecimalFormat(padrao);
			
			// df.applyPattern(padrao); //Ele formata de acordo com a localiza��o. Utilizando essa forma, a inst�ncia da linha 15 n�o passa parametros
			System.out.println(df.format(1234567890.123));
			
			DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
			dfs.setDecimalSeparator(','); //os decimais se�r�o separados por virgula
			dfs.setGroupingSeparator('.');
			
			String padrao2 = "###,###.##"; //padrao brasileiro
			df = new DecimalFormat(padrao2, dfs);
			System.out.println(df.format(1234567890.123));
			
			String padrao3 = "###,###,###.##";
			df = new DecimalFormat(padrao3, dfs);
			df.setGroupingSize(4); //configurando o tamanho do agrupamento (normalmente s�o 3 casas)
			System.out.println(df.format(1234567890.123));
			
			String padrao4 = "\u00A4###,###,000.00%"; // valor monet�rio
			df = new DecimalFormat(padrao4, dfs);
			System.out.println(df.format(0.1));
		}

}
