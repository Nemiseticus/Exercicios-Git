import java.util.Scanner;

public class TesteAnimal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Gato gato = new Gato();
		�guia aguia = new �guia();
		Macaco macaco = new Macaco();
		Animal animal = null;
		
		int x=0;
		do 
		{
		System.out.println("Digite o n�mero da op��o: *** 1 ***,*** 2 ***,*** 3 ***, ");
		x=leia.nextInt();
		if(x==1)
		{
			animal=gato;
			System.out.println("Qual o nome do seu Gato ? ");
			String nome = leia.next();
			System.out.println("Quantos anos seu Gato tem ? ");
			int idade= leia.nextInt();
			System.out.println("Qual o som seu Gato emite");
			String som = leia.next();
			System.out.println("-------------------------------------------------");
			gato.Nome(nome);
			gato.Idade(idade);
			gato.Som(som);
			
		}
		
		else if(x==2)
		{
			animal=aguia;
			System.out.println("Qual o nome do seu �guia? ");
			String nome = leia.next();
			System.out.println("Quantos anos sua �guia tem? ");
			int idade= leia.nextInt();
			System.out.println(" Qual o som sua �guia emite");
			String som = leia.next();
			System.out.println("-------------------------------------------------");
			aguia.Nome(nome);
			aguia.Idade(idade);
			aguia.Som(som);
		}
		else if(x==3)
		{
			animal=macaco;
			System.out.println("Qual o nome do seu macaco? ");
			String nome = leia.next();
			System.out.println("Quantos anos seu macaco tem? ");
			int idade= leia.nextInt();
			System.out.println("Qual o som seu macaco emite");
			String som = leia.next();
			System.out.println("-------------------------------------------------");
			macaco.Nome( nome );
			macaco.Idade( idade );
			macaco.Som( som );
			
			
		} 
		else
		{
		System.out.println("Informa��o Invalida");	
		}
		
		
	}while(x<=0||x>=4);
}}
