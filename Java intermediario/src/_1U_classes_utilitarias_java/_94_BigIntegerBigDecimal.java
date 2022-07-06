package _1U_classes_utilitarias_java;

import java.math.BigDecimal;
import java.math.BigInteger;

public class _94_BigIntegerBigDecimal {
	
	public static void main(String[] args) {
			
			//Utilizar double ou float em operações no java vai dar problema. (o valor final difere da realidade)
			double a = 0.03;
			double b = 0.04;
			double c = b - a;
			System.out.println(c);
			
			//Para fazer operações utilizamos o BigDecimal
			BigDecimal _a = new BigDecimal("0.03");
			BigDecimal _b = new BigDecimal("0.04");
			BigDecimal _c = _b.subtract(_a); //subtraindo os dois numeros acima
			System.out.println(_c);
			
			BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
			BigDecimal bd2 = new BigDecimal("987654321.9876543210");
			System.out.println(bd1.add(bd2)); //somando os dois numeros acima
			
			System.out.println(bd1.multiply(bd2)); //multiplicando
			
			System.out.println(bd1.divide(new BigDecimal(2))); //dividindo
			
			//Usamos o BigInteger para numeros grandes
			BigInteger bi = new BigInteger("10000000000000000000"); //Tem varias operações que dá pra fazer com o BigInteger tbm
			System.out.println(bi);
			
		}

}
