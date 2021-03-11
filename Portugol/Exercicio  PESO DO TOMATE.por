programa
{
	
	funcao inicio()
	{
		real peso, excesso
		escreva("Por favor, pese o(s) produto(s):")
		leia(peso)
		se (peso>=50){
			excesso = peso - 50
			escreva("O excedente deste produto é de: ", excesso*1, " \nE a multa aplicada por cada kg excedidos totalizam: R$ ", (excesso*1)*4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 212; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */