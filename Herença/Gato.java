
public class Gato extends Animal {
	
	public Gato()
	{
		super ("Gato");
	}

	@Override
public void Nome (String nomeanimal)
	{
	System.out.println("Nome do gato �:"+ nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade do gato �:"+ idadeanimal);
	}
	@Override
	public void Som (String somanimal)
	{
		System.out.println("O som do gato �:"+ somanimal);
	}
	
	

}
