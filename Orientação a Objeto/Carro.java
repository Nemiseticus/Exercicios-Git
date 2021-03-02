package POO;

public class Carro {
//Atributos
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	
	//J� que n�o foi definido o n�vel de privacidade, podemos 
	// pular para o
	//METODO
	void liga() // O m�todo void n�o precisa de retorno. Void indica
	{
		System.out.println("O carro est� ligado [...]");
	}
	void acelera(double quantidade) //criando variavel local quantidade
	{
		double velocidadeNova = this.velocidadeAtual+quantidade; //usando this. chamamos um atributos da class principal, que no caso � Carro, pra jogar no acelera
		this.velocidadeAtual = velocidadeNova; //Atualizando as velocidades	
	}
	int pegaMarcha()
	{
		if(this.velocidadeAtual<0)
		{
			return -1;
		}
		if (this.velocidadeAtual>=0 && this.velocidadeAtual<40)
		{
			return 1;
		}
		if (this.velocidadeAtual>=40 && this.velocidadeAtual<80)
		{
			return 2;
		}
		return 3;
			
	}
}
