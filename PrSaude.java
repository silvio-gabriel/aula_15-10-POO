package sem2.aula12;

public class PrSaude {

	public static void main(String[] args) {

//		medico

		Medico medico = new Medico("José jr", "cirurgião", 1500, "12345");

		System.out.println("médico");
		System.out.println("nome: " + medico.getNome());
		System.out.println("especialidade: " + medico.getEspecialidade());
		System.out.println("valor consulta" + medico.getValorConsulta());
		System.out.println("crm: " + medico.getCrm());

//		dentista

		Dentista dentista = new Dentista("joao", "dentista rico", 500, "12345");

		System.out.println("\ndentista");
		System.out.println("nome: " + dentista.getNome());
		System.out.println("especialidade" + dentista.getEspecialidade());
		System.out.println("valor consulta: " + dentista.getValorConsulta());
		System.out.println("cro: " + dentista.getCro());
//		fisioterapeuta

		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("julia", "fisio. esportiva", 3000, "123456t");

		System.out.println("\nfisioterapeuta");
		System.out.println("nome: " + fisioterapeuta.getNome());
		System.out.println("especialidade: " + fisioterapeuta.getEspecialidade());
		System.out.println("valor consulta: " + fisioterapeuta.getValorConsulta());
		System.out.println("crefito: " + fisioterapeuta.getCrefito());

	}

}
