
public abstract class Animal { //classe abstrata
	
	private String Esp�cie;
	
	public Animal (String Especie)
	{
		this.Esp�cie=Esp�cie;
			
	}
	abstract public void Nome (String nomeanimal);
	abstract public void Idade (int idadeanimal);
	abstract public void Som (String somanimal);
	
	public String getEsp�cie() {
		return Esp�cie;
	}
	public void setEsp�cie(String esp�cie) {
		Esp�cie = esp�cie;
	}
	
	
	
	
}
