programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia nome
		real n1, n2, n3, media

		escreva("Entre com o seu nome: ")
		leia(nome)

		escreva("Entre com a primeira nota: ")
		leia(n1)

		escreva(" Entre com a segunda nota: ")
		leia(n2)

		escreva(" Entre com a teceira nota: ")
		leia(n3)

		media= (n1+n2+n3)/3
		limpa()
		se (media>=7.0)
		{
			escreva("Parabéns", nome , " Você foi Aprovado com a nota ", mat.arredondar(media,2))
		}
		senao se (media>=4 e media<7)
		{
			escreva("Atenção ", nome , " Você está de Exame, com a nota ", mat.arredondar(media,2))
		}
		senao 
		{
			escreva("Atenção ", nome , "Você foi Reprovado, com a nota ", mat.arredondar(media,2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */