package _6_temUm;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		
		//relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999999");
		
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("11");
		telefone2.setNumero("88888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		contato.setTelefones(telefones); //Etapa "Must-have"
		
		//Teste saída no console
		System.out.println(contato.getNome());
		
		
		if (contato != null && contato.getEndereco() != null){ //Sempre verificar se o valor não é nulo para evitar erros.
			System.out.println(contato.getEndereco().getCidade());
		}
		
		//Telefone relacionamento Tem-um
		/*if (contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		//Telefone relacionamento Tem-muitos
		if (contato != null && contato.getTelefones() != null){
			for (Telefone t : contato.getTelefones()){
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}
}