package POO;

public class TesteCarro {

	public static void main(String[] args) 
	{
	Carro meuCarro = new Carro();
	meuCarro.cor = "Laranja";   //Alimentamos os atributos
	meuCarro.modelo = "Kwid";   // Com os dados inciais
	meuCarro.velocidadeAtual= 0; 
	meuCarro.velocidadeMaxima=80;
	
	meuCarro.liga();// Depois chamamos o metodo liga
	meuCarro.acelera(20); // Depois acelera
	System.out.println(meuCarro.velocidadeAtual); // e mostramos a velocidade atual pra ver se houve modificação
	
	}
}
