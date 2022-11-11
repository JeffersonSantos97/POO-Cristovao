package entidades;

public class Ano {
	
private int ano;
	
	
	public Ano() {
		
		this.ano = 2022;
	}
	
	public int getAno() {
		
		return ano;
	}
	
	public void setAno(int ano) {
		
		this.ano = ano;
	}
	
	public boolean ehBissexto( ) {
		
		if ( getAno() % 4 == 0) {
			
			return true;
		} else {
			
			return false;
			}
		}
		
		public void mostrarBissexto(){
			
			if(ehBissexto() == true) {
				
				System.out.println("O ano é bissexto: ");
			}
			
			else {
				
				System.out.println("Não é bissexto");
			} 
	}

	
}
