package exercicio92_heranca_gustavo_guanabara;

public class Video implements InterfaceVideo{

	protected String video;
	protected int avaliacao;
	protected int views;
	protected int curtidas;
	protected boolean reproduzindo;
	
	@Override
	public String toString() {
		return "Video [video=" + video + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}

	public Video(String video){
		this.video= video;
		this.views= 0;
		this.curtidas= 0;
		this.setReproduzindo(false);
	}
	
	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		setReproduzindo(true);
		
	}

	@Override
	public void pause() {
		setReproduzindo(false);
		
	}

	@Override
	public void like(String resposta) {
		
		if(resposta.equalsIgnoreCase("SIM")){
			setCurtidas(getCurtidas() + 1);
		}else{
			System.out.println("Ok então né...");
		}
	}
}
