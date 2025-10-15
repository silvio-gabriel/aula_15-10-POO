package sem2.aula12;

public class ProfissionalSaude {

// atributos

	private String nome;
	private String especialidade;
	private int valorConsulta;

//	construtor

	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
	}

//	get e set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(int valorConsulta) {
		this.getValorConsulta();
	}

	public void agendarConsulta() {
		System.out.println("consulta daora");
	}
}
