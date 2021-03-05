
public class Macaco extends Animal {
	
	public Macaco()
	{
		super("Macaco");
	}
	@Override
	public void Nome (String nomeanimal)
	{
	System.out.println("Nome do macaco é:"+ nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade do macaco é:"+ idadeanimal);
	}
	@Override
	public void Som (String somanimal)
	{
		System.out.println("O som do macaco é:"+ somanimal);
	}

}
