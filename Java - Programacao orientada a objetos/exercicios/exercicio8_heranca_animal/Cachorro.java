package exercicio8_heranca_animal;

public class Cachorro extends Lobo{

	@Override
	public void EmitirSom(){
	System.out.println("Au Au Au!");
	}

	public void Reagir(String frase){
		if(frase.equals ("tome comida") || frase.equals("cheguei")){
			System.out.println("Abanar e Latir");
		}else{
			System.out.println("Rosnar");
		}
	}
	public void Reagir(int hora, int min){
		if(hora < 12){
			System.out.println("Abanar o rabo!");
		}else if(hora >=18){
			System.out.println("Ignorar");
		}else{
			System.out.println("Latir");
		}
	}
	public void Reagir(boolean dono){
		if(dono){
			System.out.println("Abanar o rabo!");
		}else{
			System.out.println("Rosnar");
		}
	}
	public void Reagir(int idade, float peso){
		if(idade<5){
			if(peso<10){
				System.out.println("Abanar o rabinho");
			}else{
				System.out.println("Latir!");
			}
			
		}else{
			if(peso < 10){
				System.out.println("Rosnar");
			}else{
				System.out.println("Ignorar");
			}
		}
	}
//Não pode repetir assinatura na mesma classe, por isso os parametros e tipos são diferentes.


}
