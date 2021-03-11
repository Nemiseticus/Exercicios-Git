programa
{
	
	funcao inicio()
	{
		inteiro P, E, M, R // P=PESO.E=EXCESSO.M=MULTA

		escreva(" Digite seu peso: ")
		leia(P)

		se (P> 50)
		{
			E = P-50
			M = E*4
		}
		senao
		{
			E = 0
			M = 0
		}
		escreva("\n Excesso: ", E, " e a multa: ", M)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */