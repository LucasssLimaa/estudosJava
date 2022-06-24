package aulaDeHoje;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Pessoa p1 = new Pessoa("Mauro");
		
		p1.setIdade(15);
		System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos");
		Pessoa p2 = new Pessoa("Lima");
		new Pessoa("Jamal corno", 24);
	}
}
