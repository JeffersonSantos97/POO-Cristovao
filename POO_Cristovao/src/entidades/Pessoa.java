package entidades;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	// crei um construtor sem nada pra poder usar assim ( pessoa.xxx)
	public Pessoa() {
		
	}
	// construtor pra capturar as variavéis e colocar dentro
	public Pessoa(String nome, int idade, double altura) {
		
		this.nome = nome;
		this.idade = idade; 
		this.altura = altura;
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getIdade() {
		
		return idade;
	}
	
	public double getAltura() {
		
		return altura;
	}
	
	public void setNome(String nome) {
		if( ! nome.isEmpty()); // se não ficar vazio ficar fazio
		
		this.nome = nome;
	}
	
	public void setIdade(int idade ) {
		// idade n pode ser menor que 0 
		if( idade <= 0) {
		this.idade = idade;
		}
	} 
	
	public void setAltura(double altura ) {
		// altura tem que ser maior que 0 e menor que 3,5
		if(altura > 0 && altura <= 3.5) {
		this.altura = altura;
		}
	}
	
	// como no metodo fazAniversário se o boolean retornar true, ele acrescenta idade
	// eu crei um metodo só pra saber a respsota se faz aniversário ou não
	// retornando true ou falso
	
	public boolean respostaAniversario(String resposta) {
		
		if(resposta.equalsIgnoreCase("y")) {
			
			return true;
		}else {
			return false;
		}
		
		
	
	}
	// se o metodo retornar faz == true, acrescenta idade++ 
	public void fazAniversario(boolean faz) {
		if( faz ) {
			idade++;
		}
		
	}
	
	public String toString() {
		 
		return "\nNome: " 
				+ nome 
				+ "\n Idade: " 
				+ idade
				+ "\n altura: " 
				+ altura;
		}
	}
	

