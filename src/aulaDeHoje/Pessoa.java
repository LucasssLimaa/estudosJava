package aulaDeHoje;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome) {
		this.nome = nome;
		//System.out.println("Criando objeto");
	}
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	/*public void setNome(String nome) {
		this.nome = nome; // "this.nome" refere-se à variável global, assim ambas as variáveis podem ter o mesmo nome.
	}*/
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
