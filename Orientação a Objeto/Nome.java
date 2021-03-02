package POO;

public class Nome {

	public static void main(String[] args) 
	{
		//Aqui estamos transferindo os parametros criados na class Pessoa 
		//Instanciando pessos1 com new, do tipo Pessoa
		Pessoa  pessoa1 = new Pessoa ("Marina Helena", "Araújo", "Martins");
		System.out.println(pessoa1.getNomeCompleto());
	}
}
