package Array;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int contlinha=0, contcoluna=0, maior10=0;
		
		
		
		for (int l = 0; l <3; l++)	{
			
			for (int c = 0; c <3 ; c++) {
				
				System.out.println("Insira um valor: ");
				matriz[l] [c] = leia.nextInt();
				
				if (matriz [l][c]  >10)
				{
					maior10++;
				}
			}
			
			
			}
		System.out.println("A quantidade de valores que passaram de 10 é: "+ maior10);


		} 
	}


/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
 * possui.
 */