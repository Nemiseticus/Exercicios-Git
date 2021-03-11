programa
{
	
	funcao inicio()
	{
		inteiro x, contador, resDivisao
		escreva("Selecione o número para a contagem: " )
		para (x=0;x<=500;x++)
		{
		resDivisao = x%2

			se (resDivisao==1)
			{

			resDivisao= x%3

			se (resDivisao==0)
			{
			escreva("\n", x)
			}
			}
		}
		
		
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */