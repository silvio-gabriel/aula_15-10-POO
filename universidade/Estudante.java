package sem2.aula12.universidade;

public class Estudante {
    
	private String nome;
	private Universidade universidade;
	
	public Estudante(String nome, Universidade universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
