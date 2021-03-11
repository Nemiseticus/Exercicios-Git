programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
		real altura, nota1, nota2, nota3, mediaPonderada
		
		escreva("Escreva seu nome: \n")
		leia(nome)
		
		escreva("Digite a primeira nota: \n")
		leia(nota1)
		escreva("Digite a segunda nota: \n")
		leia(nota2)
		escreva("Digite a terceira nota: \n")
		leia(nota3)
		
		mediaPonderada= (nota1*2)+(nota2*3)+(nota3*5)/10
		escreva(" A média ponderada é = ", mediaPonderada)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */