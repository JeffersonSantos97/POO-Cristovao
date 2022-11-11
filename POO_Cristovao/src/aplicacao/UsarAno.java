package aplicacao;

import java.util.Scanner;

import entidades.Ano;

public class UsarAno {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		Ano ano = new Ano();
		
		System.out.print("Entre com o ano: ");
		 int a = sc.nextInt();
		 
		 ano.setAno(a);
		 
		 System.out.println("Ano: " + ano.getAno());
		 
		 if(ano.ehBissexto() == true) {
			 
			 System.out.println(" EH Bissexto ");
		 } else {
			 
			 System.out.println(" Não eh Bissexto ");
		 }
		
		ano.getAno();
		
		
		
		
		sc.close();
	}

}
