package aplicacao;

import java.util.Scanner;

import entidades.Numero;

public class UsarNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.println("Entre com um numero: ");
		Numero num = new Numero();
		num.setNumero( sc.nextInt() );
		
		System.out.println(num.inverter());
		
		
		
		
		
		
		
		
		
	sc.close();
	}

}
