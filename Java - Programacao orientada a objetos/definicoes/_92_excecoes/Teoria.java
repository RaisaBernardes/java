/*

Qual é a diferença entre ERRO e EXCEÇÃO no java?
		
Um erro é um erro que vai acontecer em tempo de execução e vai fazer com que o programa termine a execução. 
Ex.: "Out of memory error". Esse tipo de erro é um erro não verificavel e não é tratável no Java. (Errors não são 
tratados no Java)


Qual é a diferença entre exceções verificadas e não verificadas?

EXCEÇÕES NÃO VERIFICADAS >>> Ocorre em TEMPO DE EXECUÇÃO.
- ArrayIndexOutOfBoundsException  ->  (Índice do array não existente)
- NullPointerException  -> (Objeto nulo) Pode ocorrer quando vc tenta chamar um método de um objeto que ainda não foi instanciado.
- ArithmeticException 

EXCEÇÕES VERIFICADAS >>> O compilador vai reclamar e vai pedir pra vc tratar as exceções no seu programa.
- IOException >> Pode ocorrer em acesso a arquivos (leitura ou escrita), e aí precisamos tratar esse tipo de exceção
- SQLException >> Deve ser tratada.

*/



package _92_excecoes;

public class Teoria {

}
