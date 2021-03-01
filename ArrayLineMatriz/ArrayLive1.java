package Array;

import java.util.Scanner;

public class ArrayLive1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num[]= new int[6];
		int par=0, impar=0, somapar=0, somaimpar=0;
		for (int x=0 ; x<6 ; x++)
		{
			System.out.println("Insira um valor: ");
			num[x] = leia.nextInt();
			if (num[x]%2==0)
			{
			par++;	
			somapar=somapar+num[x];
			}
			else
			{
				impar++;
				somaimpar=somaimpar+num[x];
			}

		}System.out.println("A soma dos pares é: "+somapar);
		System.out.println("A soma dos impares é: "+ somaimpar);
	}
}
/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/