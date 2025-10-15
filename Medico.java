package sem2.aula12;

public class Medico extends ProfissionalSaude {

// atributo
	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public void agendarConsulta() {
		System.out.println("consulta medico");
	}

}
