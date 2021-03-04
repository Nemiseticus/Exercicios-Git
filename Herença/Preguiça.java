package Aprende;

public  class Preguiça extends Animal { //herença de animal com extends
	
	public Preguiça()
	{
		super("Preguiça");
	}
	
//implementar nome do animal, sobrescrevendo
	
	@Override
	public void Nome(String nomeanimal)
	{
		System.out.println("Nome do preguiça"+nomeanimal);
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
		System.out.println("Som que o preguiça emite é: "+somanimal);
	}
	public void SubirArvores()
	{
	System.out.println("Som que o preguiça  é não correr");
	}
	
	
	
}
