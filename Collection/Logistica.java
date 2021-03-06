import java.util.ArrayList;
import java.util.Collection;

public class Logistica {

public static void main(String[] args) {
	
	Collection <String> armazenar = new ArrayList();
	
	armazenar.add("Matéria Prima");
	armazenar.add("Produto Acabado");
	armazenar.add("Lucro líquido"); 
	

	System.out.println("\nLista de pilares de um negócio"+armazenar);
	
	if (armazenar.isEmpty()) // Para ver essa função funcionando basta apagar manualmente um atributo da lista
	{
		System.out.println("\nCompramos "+armazenar+"este mês");
		
	}
	else
	{
		System.out.println("\nArmazenamos o estoque com "+ armazenar+ "este mês");
	}
	armazenar.remove("Matéria Prima");
	System.out.println("\nLista de pilares de um negócio"+armazenar);
	
	armazenar.clear();
	System.out.println("\n A lista foi atualizado... "+armazenar+ " Pronta para ser reutilizada");
	
}	
	
}


/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List ****
Remover dados da list; ****
Atualizar dados da list. 
Apresentar todos os dados da list.*/