package POO;

public class Avião {
	double acelerando;
	String voo;
	double desacelerando;

	void decolando(int i)
	{
		System.out.println("O avião está decolando...");
		
	}
	void aterrissando()
	{
		System.out.println("O avião está aterrissando...");
		
	
	
	if (this.desacelerando<=200)
	{
		System.out.println("O avião está desacelerando");
	}
	else
	{
		System.out.println("O avião está acelerando");
	}
	
}
}


/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/