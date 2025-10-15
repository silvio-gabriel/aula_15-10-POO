package sem2.aula12;

public class Dentista extends ProfissionalSaude {

	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}
	
	public void agendarConsulta() {
		System.out.println("consulta dentista");
	}

}
