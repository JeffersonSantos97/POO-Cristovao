package entidades;

public class Numero {

	private int numero;

	public Numero() {

		this.numero = 12; // pra fazer o teste com dois digitos invertendo

//                            o atributo numero já vai iniciar sendo 12   
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) {
		// só lidando com os numeros positivos
		if (numero >= 0) {

			this.numero = numero;

		}

	}

	public int inverter() {

		String numeroStr = "" + numero;// pegar o numero e tranfromar em String

// 		                               Pra transformar um int em String vc deve colocar uma ( " " + o que vc quer ) 

		String inverso = "";// variável que vai receber o inverso // está em branco
 
		for (int i = 0; i < numeroStr.length(); i++) {

			inverso = numeroStr.charAt(i) + inverso;
//         0 inverso =  " " + 1 = " 1 " pq uma variável concatenada antiromente a dupla aspadas, entre nela    
//		   1 inverson = 2 + "1"  = "21"
		}

		return Integer.parseInt(inverso); // transformar em inteiro o inverso
	}
}
