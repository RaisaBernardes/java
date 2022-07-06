package exercicio93_interface_controle_remoto;

public interface Controlador {
	// A interface n�o tem atributos.
	// A interface apenas define os metodos de a��o.
	
	public void Ligar();
	public void Desligar();
	public void MudarCanal(int canal);
	public void AumentarVolume();
	public void DiminuirVolume();
	public void Play();
	public void Pausar();

}
