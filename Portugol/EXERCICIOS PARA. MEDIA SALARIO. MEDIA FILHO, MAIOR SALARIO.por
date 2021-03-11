programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real salario, mediasal, somarsal=0.0, maiorsal=0.0,medianf=0.0,percentual=0.0
	inteiro x, nf, somarnf=0, conta100=0
	para (x=1;x<=4;x++)
	{
		escreva("Por favor, insira o valor do salário familiar: ")
		leia(salario)
		escreva("Por favor, insira a quantidade de filhos: ")
		leia(nf)
		somarsal= somarsal + salario //somando todos os salários
		somarnf= somarnf + nf
		
		se (maiorsal<salario)
		{
			maiorsal = salario
		}
		se (salario<=100)
		{
		conta100++ //conta100=conta100+
		}
		
	}
	percentual = conta100*100.0/4
	limpa()
	escreva("O percentual de salário de até R$ 100 é de ", percentual, "%")
	escreva("\nO maior salário é: R$ ", maiorsal)
		mediasal= somarsal/4
		medianf= somarnf/4.0
	escreva("\nA média dos salários da população é: R$ " , mat.arredondar(mediasal, 2))
	escreva("\nA média de filhos por família é: ", medianf)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 856; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */