package POO;

public class Fornecedor extends Povo {
	private double cr�dito;
	private double d�vida;
	
	public Fornecedor (String nome, String marca, String endere�o, double cr�dito, double d�vida)
	{
	
	super (nome, marca, endere�o);
	this.cr�dito= cr�dito;
	this.d�vida=d�vida;
	
	}

	void quitado()
	{
		System.out.println("O d�bito foi pago. . . ");
	}
	void acrescimo(double adicionado) //variavel local
	{
		double novoSaldo = this.cr�dito+adicionado;
		this.cr�dito=novoSaldo; //atualizando dados
	}
	double dep�sito()
	{
		if (cr�dito<0)
		{
			return -1;
		}
		if (cr�dito>0 && cr�dito>=1)
		{
			return 1;
		}
		return cr�dito;
	}

	
	
}
