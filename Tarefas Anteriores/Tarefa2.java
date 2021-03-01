import java.util.Scanner;

	public class Aula1 {
	
		public static void main(String[] args) {
		
		int totalDias, anos, meses, dias;
		
		Scanner entrada =  new Scanner(System.in); //Scanner é um objeto que vem da biblioteca
	
		System.out.println("Entre com o total de dias: "); 
		totalDias= entrada.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias%365)/30; // o simbolo % e significa o resto da divisao
		dias = (totalDias%365)%30;
		
		System.out.printf("Eu tenho: %d anos(s), %d mes(es) e %d dia(s) ", anos, meses, dias);
	}
	
}
/* Pra chamar o Scanner apelide ele com um nome, 
nesse caso, entrada coloque = new Scanner(System.in)
*/