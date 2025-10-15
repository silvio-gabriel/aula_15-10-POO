package sem2.aula12.agregacao;

public class Carro {

	private String modelo;
	private Motor motor; // agregação

	public Carro(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
