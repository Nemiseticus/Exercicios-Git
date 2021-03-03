package POO;

public class Povo {
	
private String nome;
private String marca;
private String endereço;

Povo (String nome, String marca, String endereço) //Atribuindo os metodos da class para o construtor
{
	this.nome=nome;
	this.marca=marca;
	this.endereço=endereço;
	
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

public String getEndereço() {
	return endereço;
}

public void setEndereço(String endereço) {
	this.endereço = endereço;
}



}
/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;

Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
Fornecedor e os herdados da classe Pessoa.*/