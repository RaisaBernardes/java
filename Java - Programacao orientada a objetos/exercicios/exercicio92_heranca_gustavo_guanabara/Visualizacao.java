package exercicio92_heranca_gustavo_guanabara;

public class Visualizacao {
	
	protected Gafanhoto aluno;
	protected Video video;
	
	public Visualizacao(Gafanhoto aluno, Video video){
		this.aluno= aluno;
		this.video= video;
		this.aluno.setTotAssistido(aluno.getTotAssistido() + 1);
		this.video.setViews(video.getViews() + 1);
	}
	
	public Visualizacao(){
		this.aluno.setTotAssistido(aluno.getTotAssistido() + 1);
		this.video.setViews(video.getViews() + 1);
	}
	
	public void avaliar(int nota){
		this.video.setAvaliacao(video.getAvaliacao() + nota);

	}
	
	public Gafanhoto getAluno() {
		return aluno;
	}
	public void setAluno(Gafanhoto aluno) {
		this.aluno = aluno;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Visualizacao [aluno=" + aluno + ", video=" + video + "]";
	}

}
