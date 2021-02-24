import java.util.Scanner;

public class Tarefa1 {
	
public static void main (String args[]) {
	Scanner ler =  new Scanner(System.in);
	int anos, meses, dias, totalDias;
	System.out.println("Insira sua idade em anos: ");
	anos = ler.nextInt();
	
	System.out.println("Insira sua idade em mes (es): ");
	meses = ler.nextInt();
	
	System.out.println("Insira sua idade em dia (s): ");
	dias = ler.nextInt();
	
	
	totalDias = anos*365+ meses*30 + dias;
	System.out.println("Sua idade convertida em dias é: " + totalDias);

}

}
