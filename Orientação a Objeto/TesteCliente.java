package POO;

public class TesteCliente {

	public static void main(String[] args)
	{
	Cliente cliente1 = new Cliente();
	cliente1.NomeCompleto = "Marina Helena Araújo Martins. ";
	cliente1.Idade = "\nde Vinte e Cinco";
	cliente1.Comprou = " anos, comprou 1 saco de filé de frango temperado";  
	cliente1.EmProdutos = " por $ Dez Reais";
	
	System.out.println(cliente1.getRomaneio());
	
	}
}
