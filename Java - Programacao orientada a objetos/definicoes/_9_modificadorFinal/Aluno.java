package _9_modificadorFinal;

public class Aluno  {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone); //Não vai conseguir utilizar por causa do "final" na classe Pessoa
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia(){
		return 0;
	}

	public boolean verificarAprovado(){
		return true;
	}

	public void metodoQualquer(){
		//super.setCpf("345345345354"); //Não vai conseguir utilizar por causa do "final" na classe Pessoa

		//this.setCpf("34534534"); //Não vai conseguir utilizar por causa do "final" na classe Pessoa
	}

	public String obterEtiquetaEndereco(){

		String s = "Endereço do Aluno: ";
		//s += super.getEndereco(); //Não vai conseguir utilizar por causa do "final" na classe Pessoa
		
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}
}