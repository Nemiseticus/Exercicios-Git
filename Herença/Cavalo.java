package Aprende;

public  class Cavalo extends Animal { //herença de animal com extends
	
	public Cavalo()
	{
		super("Cavalo");
	}
	
//implementar nome do animal, sobrescrevendo
	
	@Override
	public void Nome(String nomeanimal)
	{
		System.out.println("Nome do cachorro"+nomeanimal);
	}
	//implementar idade do anomal, sobreescrevendo
	
	@Override
	public void Idade(int idadeanimal)
	{
		System.out.println("Idade do animal"+idadeanimal);
	}
	//implementar
	
	@Override
	public void Som (String somanimal)
	{
		System.out.println("Som que o cachorro emite é: "+somanimal);
	}
	public void Correr()
	{
	System.out.println("Som que o preguiça  é não correr");
	}

	
	
	
}
