programa
{
	
	funcao inicio()
	{
		real ip

		escreva("Escreve o índice de poluição:")
		leia(ip)

		se(ip>=0.05 e ip<=0.25)
		{
			escreva("Índice de Poluição Estável")
		}
		senao se(ip>0.25 e ip<=0.3)
		{
			escreva("Intime as empresas do primeiro grupo")
		}
		senao se(ip>0.3 e ip<0.4)
		{
			escreva("Intime as empresas do primeiro e segundo grupo")
		}
		senao
		{
			escreva("Índice sem classificação")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */