package sem2.aula12.universidade;

public class PrAssociacao {

	public static void main(String[] args) {

		Universidade universidade = new Universidade("USP");

		Estudante estudante = new Estudante("João", universidade);

		System.out.println("estudante: " + estudante.getNome() + "\nuniversidade: " + universidade.getNome());

	}

}
