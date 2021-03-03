package POO;

public class Fornecedor extends Povo {
	private double crédito;
	private double dívida;
	
	public Fornecedor (String nome, String marca, String endereço, double crédito, double dívida)
	{
	
	super (nome, marca, endereço);
	this.crédito= crédito;
	this.dívida=dívida;
	
	}

	void quitado()
	{
		System.out.println("O débito foi pago. . . ");
	}
	void acrescimo(double adicionado) //variavel local
	{
		double novoSaldo = this.crédito+adicionado;
		this.crédito=novoSaldo; //atualizando dados
	}
	double depósito()
	{
		if (crédito<0)
		{
			return -1;
		}
		if (crédito>0 && crédito>=1)
		{
			return 1;
		}
		return crédito;
	}

	
	
}
