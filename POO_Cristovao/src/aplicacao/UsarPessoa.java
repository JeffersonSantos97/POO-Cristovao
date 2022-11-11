package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class UsarPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Entre com o nome: ");
		String nome = sc.nextLine();

		System.out.println("Entre com a Idade: ");
		int idade = sc.nextInt();

		System.out.println("Entre com a altura: ");
		double altura = sc.nextDouble();

		 pessoa = new Pessoa(nome, idade, altura);
		sc.nextLine();
		System.out.println("Está fazendo aniversário [ y/n ] ? ");
		String resposta = sc.nextLine(); 
		
		boolean resultResposta = pessoa.respostaAniversario(resposta);
		
		pessoa.fazAniversario(resultResposta);

		System.out.println(pessoa);

		sc.close();

	}

}
