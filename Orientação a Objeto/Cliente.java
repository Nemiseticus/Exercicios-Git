package POO;

public class Cliente {
//Atributos 
	String NomeCompleto;
	String Idade;
	String Comprou;
	String Quantidade;
	String EmProdutos;
	
	public String getRomaneio()
	{
		String Romaneio = NomeCompleto+" "+Idade+" "+Comprou+" "+Quantidade+" "+EmProdutos;
		return Romaneio;
	}
}
