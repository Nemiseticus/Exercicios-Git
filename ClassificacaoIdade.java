import java.util.Scanner;

public class ClassicacaoIdade {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua idade: ");	
		idade = leia.nextInt();
		//Dentro de uma estrutura ou fora dela, n�o coloca ponto e v�rgula "  ;   "
		if (idade<=14)
		{
			System.out.println("Sua classifica��o � Infantil");
		}
		else if (idade<=17)
		{
			System.out.println("Sua classifica��o � Juvenil");
		}
		else
		{
			System.out.println("Sua classifica��o � Adulta");
		}
	}
	
	
}
