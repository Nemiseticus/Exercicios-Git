import java.util.Scanner;

public class Nota {
public static void main(String[] args) {
	
	double nota1, nota2, nota3, mediaPonderada;
	Scanner leia = new Scanner(System.in);
	System.out.println("Por favor, entre com sua 1° nota: ");
	nota1 = leia.nextDouble();
	
	System.out.println("Por favor, entre com sua 2° nota: ");
	nota2 = leia.nextDouble();
	
	System.out.println("Por favor, entre com sua 3° nota: ");
	nota3 = leia.nextDouble();
	
	mediaPonderada =(nota1*3 + nota2*3+ nota3*4)/10;
	System.out.printf("Sua média é "+ mediaPonderada);
	mediaPonderada = leia.nextDouble();
}
}
