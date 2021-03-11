programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real numero, contador=0.0, media=0.0, somatotal=0.0
		escreva("Por favor, adicione o número incial: ")
		leia(numero)
		enquanto (numero>0)
		{
			somatotal= somatotal+numero
			contador++
			
			media= somatotal/contador
			escreva("Por favor, adicione o número incial: ")
			leia(numero)
		}
		escreva("A média total da soma é: ", somatotal, " E a média equivale a: ", mat.arredondar(media, 2), " A quantidade de valores lido são : ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */