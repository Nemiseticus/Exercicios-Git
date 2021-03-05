
public abstract class Animal { //classe abstrata
	
	private String Espécie;
	
	public Animal (String Especie)
	{
		this.Espécie=Espécie;
			
	}
	abstract public void Nome (String nomeanimal);
	abstract public void Idade (int idadeanimal);
	abstract public void Som (String somanimal);
	
	public String getEspécie() {
		return Espécie;
	}
	public void setEspécie(String espécie) {
		Espécie = espécie;
	}
	
	
	
	
}
