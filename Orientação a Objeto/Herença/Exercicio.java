package POO;

public class Exercicio {
	public static void main(String[] args) {
		
		Povo Dengoso = new Povo ("Dengo", "Cats", "CATLANDIA" );
		Fornecedor Curunhaw = new Fornecedor ("Curumíticus", "Gatomania", "CidadeDosGatos", 300 ,);
		System.out.println(Dengoso.getNome());
		System.out.println(Curunhaw.getEndereço());
		System.out.println(Curunhaw.depósito());
	}

}
