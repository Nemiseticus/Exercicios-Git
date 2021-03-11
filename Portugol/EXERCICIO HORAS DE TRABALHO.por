programa
{
	
	funcao inicio()
	{
	real hora, excedente
	escreva("Aplique as horas trabalhadas: ")
	leia(hora)
	se (hora>50){
	excedente = hora - 50
	escreva("Suas horas acumuladam são: ", excedente*1, " \nE equivalem a: R$ ", (excedente*1)*20+500)
	}
	senao se((hora<=50) e (hora>0)) {
		escreva("Suas horas acumuladam são: ", hora, " \nE equivalem a: R$ ", hora*10)
	}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */