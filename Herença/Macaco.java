
public class Macaco extends Animal {
	
	public Macaco()
	{
		super("Macaco");
	}
	@Override
	public void Nome (String nomeanimal)
	{
	System.out.println("Nome do macaco �:"+ nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade do macaco �:"+ idadeanimal);
	}
	@Override
	public void Som (String somanimal)
	{
		System.out.println("O som do macaco �:"+ somanimal);
	}

}
