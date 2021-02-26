import java.util.Scanner;

public class ClassicacaoIdade {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua idade: ");	
		idade = leia.nextInt();
		//Dentro de uma estrutura ou fora dela, não coloca ponto e vírgula "  ;   "
		if (idade<=14)
		{
			System.out.println("Sua classificação é Infantil");
		}
		else if (idade<=17)
		{
			System.out.println("Sua classificação é Juvenil");
		}
		else
		{
			System.out.println("Sua classificação é Adulta");
		}
	}
	
	
}
