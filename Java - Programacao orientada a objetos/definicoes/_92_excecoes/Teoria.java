/*

Qual � a diferen�a entre ERRO e EXCE��O no java?
		
Um erro � um erro que vai acontecer em tempo de execu��o e vai fazer com que o programa termine a execu��o. 
Ex.: "Out of memory error". Esse tipo de erro � um erro n�o verificavel e n�o � trat�vel no Java. (Errors n�o s�o 
tratados no Java)


Qual � a diferen�a entre exce��es verificadas e n�o verificadas?

EXCE��ES N�O VERIFICADAS >>> Ocorre em TEMPO DE EXECU��O.
- ArrayIndexOutOfBoundsException  ->  (�ndice do array n�o existente)
- NullPointerException  -> (Objeto nulo) Pode ocorrer quando vc tenta chamar um m�todo de um objeto que ainda n�o foi instanciado.
- ArithmeticException 

EXCE��ES VERIFICADAS >>> O compilador vai reclamar e vai pedir pra vc tratar as exce��es no seu programa.
- IOException >> Pode ocorrer em acesso a arquivos (leitura ou escrita), e a� precisamos tratar esse tipo de exce��o
- SQLException >> Deve ser tratada.

*/



package _92_excecoes;

public class Teoria {

}
