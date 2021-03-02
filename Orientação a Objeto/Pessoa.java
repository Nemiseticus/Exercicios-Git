package POO;
//Criado a Classe...
public class Pessoa {
	
	//(1) passo --> Atributos ou m�todos
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	
	//(2) passo --> Construtores: servem para dar acesso a outros m�todos publicos. O nome do construtor deve ser o mesmo da class
	//				Nesse caso, ele est� recebendo os nomes com parametros e est� atribuindo a� aos atributos do private
	//				O Construtor executar algum procedimento sobre o objeto criado pelo comundo " new "
	public Pessoa (String primeiro, String meio, String ultimo) //Parametros
	{
		//(3) passo --> Atribuir os valores da class para os construtores dentro da chave
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomeDoMeio = meio;
	}
	//(4) Criando m�todo pra juntar os tr�s nomes.
	public String getNomeCompleto()
	{
		String NomeCompleto = primeiroNome+" "+nomeDoMeio+" "+ultimoNome; //Foi criado um String/Variavel local com chamada de NomeCompleto p concatenar os atributos da classe Pessoa, q no caso, sao os nomes
		return NomeCompleto; 
	}
	


}
