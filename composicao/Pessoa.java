package sem2.aula12.composicao;

public class Pessoa {

	private String nome;
	private Coracao coracao; // composição

//	construtor 

	public Pessoa(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Coracao(coracao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCoracao() {
		return coracao.getBatimentos();
	}

}
