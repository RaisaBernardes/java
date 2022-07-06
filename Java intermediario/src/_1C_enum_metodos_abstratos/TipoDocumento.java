package _1C_enum_metodos_abstratos;

//os métodos abstratos do meu enum podem ser declarados numa interface a qual a classe enum vai implementar, 
//ou dentro do meu enum.

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
}