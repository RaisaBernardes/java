package exercicio93_interface_controle_remoto;

public class Controle implements Controlador {

	private int volume;
	private boolean status;
	private boolean tocando;
	private int canal;
	
	public Controle(int volume, boolean status, boolean tocando, int canal){
		this.volume = 50;
		this.status = false;
		this.tocando = false;
		this.canal = canal;
	}
	
	public int getVolume(){
		return this.volume;
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public boolean getStatus(){
		return this.status;
	}
	
	public boolean getTocando(){
		return this.tocando;
	}
	
	public void setVolume(int volume){
		this.volume=volume;
	}
	
	public void setCanal(int canal){
		this.canal=canal;
	}
	
	public void setStatus(boolean status){
		this.status=status;
	}
	
	public void setTocando(boolean tocando){
		this.tocando= tocando;
	}

	@Override
	public void Ligar() {
		if(getStatus() == false){
			setStatus(true);
			System.out.println("Você ligou a tv");
		}else{
			System.out.println("A TV já está ligada!");
		}
		
	}

	@Override
	public void Desligar() {
		if(getStatus() == true){
			setStatus(false);
			System.out.println("Você desligou a tv!");
		}else{
			System.out.println("A TV já está desligada!");
		}
		
	}

	@Override
	public void MudarCanal(int canal) {
		if(getStatus() == true){
			setCanal(canal);
			System.out.println("Canal: " + getCanal());
		}else{
			System.out.println("A TV está desligada... Ligue primeiro!");
		}
		
	}

	@Override
	public void AumentarVolume() {
		if(getStatus() == true){
			if(getVolume() < 50){
			setVolume(getVolume() + 1);
			System.out.println("Volume: " + getVolume());
		}else{
			System.out.println("Volume máximo atingido!");
		}
		
		}else{
			System.out.println("A TV está desligada... Ligue primeiro!");
		}
	}

	@Override
	public void DiminuirVolume() {
		if(getStatus() == true){
			if(getVolume() > 0){
				setVolume(getVolume() - 1);
				System.out.println("Volume: " + getVolume());
			}else{
				System.out.println("Volume mínimo atingido!");
			}
		}else{
			System.out.println("A TV está desligada... Ligue primeiro!");
		}
		
	}

	@Override
	public void Play() {
		if(getStatus()== true){
			if(getTocando()== false){
				setTocando(true);
				System.out.println("Está tocando!");
			}
		}
		
	}

	@Override
	public void Pausar() {
		if(getStatus() == true){
			if(getTocando() == true){
				setTocando(false);
				System.out.println("Pausado");
			}
		}
	}
}
