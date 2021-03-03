package POO;

public class Povo {
	
private String nome;
private String marca;
private String endere�o;

Povo (String nome, String marca, String endere�o) //Atribuindo os metodos da class para o construtor
{
	this.nome=nome;
	this.marca=marca;
	this.endere�o=endere�o;
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getEndere�o() {
	return endere�o;
}

public void setEndere�o(String endere�o) {
	this.endere�o = endere�o;
}



}
/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
String telefone;

Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe
Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito
m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe
Fornecedor e os herdados da classe Pessoa.*/