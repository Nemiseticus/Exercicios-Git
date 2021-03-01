import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		int num1, num2, num3, maior=0;
		System.out.println("Coloque o valor: ");
		Scanner leia = new Scanner (System.in);
		num1 = leia.nextInt();
		
		System.out.println("Coloque o valor: ");
		num2 = leia.nextInt();
		
		System.out.println("Coloque o valor: ");
		num3 = leia.nextInt();
		
		if (num1>=num2 && num1>=num3)
		{
			maior = num1;
		}
		if (num2>=num1 && num2>=num3)
		{
			maior = num2;
		}
		if (num3>=num1 && num3>=num2)
		{
			maior = num3;
		}
		System.out.println("O maior valor é: "+ maior);
	}
}
