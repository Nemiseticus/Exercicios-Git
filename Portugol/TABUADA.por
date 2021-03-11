programa
{
	
	funcao inicio()
	{
		inteiro L, T, R //L de Looping, T de Tabuada e R de Resposta
		escreva("Selecione o n° da tabuada que deseja vizualizar: ")
		leia(T)
		limpa() //Usado para tirar a escreva e a resposta da impressão
		para(L=1;L<=10;L++)
		{
			R = L * T
			escreva("\n", L, " X ", T, " = ", R) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */