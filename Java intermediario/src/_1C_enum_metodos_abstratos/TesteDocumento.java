package _1C_enum_metodos_abstratos;

public class TesteDocumento {

	public static void main(String[] args) {
		
		/*for (TipoDocumento doc : TipoDocumento.values()){
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}*/

		//Pessoa física
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());// o parâmetro do método "setNumeroDocumento" é uma string
		System.out.println(pf);
		
		//Pessoa juridica
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
	}

}