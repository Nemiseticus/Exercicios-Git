import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		int idade=0, ate21=0, maisde50=0, x;
		Scanner leia = new Scanner(System.in);
		
		 while(idade !=-99) //for (x=1;x<=4;x++)
		{
			System.out.println("Por favor, coloque sua idade: ");
			idade = leia.nextInt();
			if (idade<=21) 
			{
				ate21++;
				
			}
			
			if (idade>=50)
			{
				maisde50++;
			}
			

		}
		System.out.println(" A quantidade de pessoas de até 21 é de: " + ate21);
		System.out.println(" A quantidade de pessoas que excedem 50 é de: " + maisde50);

	}
}
