package _1M_annotations_e_GarbageCollector;

/*----GARBAGE COLLECTOR----
CONTEXTO:
Se instanciarmos um objeto dentro de um método e o método terminar com a execução, esse objeto deixará de ser referenciado pois 
ele não existirá mais. Nesse caso
a informação continuará na memória heap do java. Ocupa memória desnecessária. Lixo. Aí entra o colletor de lixo do java.

COMO FUNCIONA:
O Garbage collector varre a memória e limpa esses objetos. Ele marca quais são as referências que são mais utilizadas pelo programa
e então remove da memória. Ele otimiza a memória. Não fica um espaço em branco. E na próxima vez que um objeto for instanciado
ele ocupará o final da fila.

*/

public class TeoriaGarbageCollector {

}
