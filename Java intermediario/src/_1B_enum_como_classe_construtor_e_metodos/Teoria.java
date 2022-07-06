/*
*********OBSERVAÇÕES**********
- Enums extends a classe java.lang.Enum
- Enums podem ser comparados utilizando ==, diferente da comparação de classes no java que utiliza-se o método equals.
- Enums não podem ser instanciadas com new
- Não existe herança em uma classe enum
- Podem implementar interfaces
- Pode ser declarado separadamente ou dentro de classe
- Não se deve criar setters para as propriedades de um enum, pois isso vai de encontro com sua característica imutável.

********Método values()********
Os valores Enum tem um método estático chamado values que retorna uma matriz contendo todos os valores do enum na ordem 
em que são declarados. Este método é normalmente usado em combinação com o "for" para construir cada repetição dos valores 
de um tipo de enumeração.


********Método valueOf()********

Todos os objetos em Java possuem um método toString que permite obter a representação em string do objeto em questão, 
por exemplo, para fins de exibição. Porém, os tipos primitivos (como int, float, boolean, char, etc.) não possuem esse 
método. No entanto, ainda assim, é possível obter a representação de string de um tipo primitivo usando um método especial pertencente à 
classe String: o método valueOf.

Resumindo: O método valueOf() retorna o objeto da classe enum cujo nome é a string do argumento.

Ex.: Integer num18 = Integer.valueOf(1343); //Transforma um tipo inteiro em uma instância da classe Integer

*/


package _1B_enum_como_classe_construtor_e_metodos;

public class Teoria {

}
