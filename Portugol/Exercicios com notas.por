programa
{
	
	funcao inicio()
	{
	real nota1, nota2, nota3, mediaPonderada // Peso da nota1 3. Peso da nota2 3. Peso da nota3 4 e divide tudo por 10

	escreva("Entre com a primeira nota")
	leia(nota1)
	escreva("Entre com a segunda nota")
	leia(nota2)
	escreva("Entre com a terceira nota")
	leia(nota3)

	mediaPonderada = (nota1*3+nota2*3+nota3*4)/10 // Use os valor dos pesos na ordem das respectivas notas

	escreva("Média Ponderada: ",mediaPonderada)

	se(mediaPonderada>=7 e mediaPonderada<=10)
	{
		escreva("Aluno(a) Aprovado(o)")
	}
	senao se(mediaPonderada>=4 e mediaPonderada<7)
	{
		escreva("Aluno(a) Ficou de Exame...")
		
	}
	senao 
	{
		escreva("Aluno(a) Reprovado(a)")	
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */