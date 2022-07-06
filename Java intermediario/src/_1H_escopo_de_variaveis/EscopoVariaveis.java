package _1H_escopo_de_variaveis;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor){ //quando declaramos um parâmetro em um método, é criada uma variável local com o mesmo nome
										//então se a gente fizer qualquer referência a essa variável dentro do método, esse valor
										//está fazendo referência ao parâmetro e não ao atributo la em cima.
		valor = valor + 10;
		
		//this.valor = valor; //Para modificar o valor do atributo teria que utilizar a palavra this.

		return valor;
	}

	public int teste(){

		int valor = 5;

		if (true){

			valor--;
		}

		//this.valor = valor; //referencial valor global/atributo da classe

		return valor;
	}

	public void outroTeste(){

		for (int i=0; i<10; i++){
			System.out.println(i);
		}
		
		//i++; //erro de compilação

		int j;
		for (j=0; j<10; j++){
			System.out.println(j);
		}

		System.out.println(j); //j tem valor 10
	}

	public void maiUmTeste(){

		boolean flag = true;
		
		if (flag){

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		//System.out.println(umaVariavel); //erro de compilação
	}

	public void maiUmOutroTeste(int num){

		int total = 0;

		try {
			int outroNum = 0;

			total = num/outroNum;

		} catch (Exception e){
			e.printStackTrace();
		} finally {

			total++;
			//outroNum++; //erro de compilação
			//e.printStackTrace(); //erro de compilação
		}

		num++;

		//outroNum++; //erro de compilação
		//e.printStackTrace(); //erro de compilação
	}
}