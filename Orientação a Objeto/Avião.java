package POO;

public class Avi�o {
	double acelerando;
	String voo;
	double desacelerando;

	void decolando(int i)
	{
		System.out.println("O avi�o est� decolando...");
		
	}
	void aterrissando()
	{
		System.out.println("O avi�o est� aterrissando...");
		
	
	
	if (this.desacelerando<=200)
	{
		System.out.println("O avi�o est� desacelerando");
	}
	else
	{
		System.out.println("O avi�o est� acelerando");
	}
	
}
}


/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/