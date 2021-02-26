import java.util.Scanner;

public class FACA {

	public static void main(String[] args) {
		int x, acomulador=0, soma=0;
		float media=0;
		Scanner leia = new Scanner(System.in);

		do
		{
			System.out.println("Entre com um valor: ");
			x = leia.nextInt();
			acomulador++;
			if (x%3==0)
			{
			soma= soma+x;	
			}
		} while (x!=0);
		media=soma/acomulador;

		System.out.println("A média dos números múltiplos de 3 é: "+ media);
	}
}
/*Escrever um programa que receba vários números inteiros no teclado. E no
Final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */