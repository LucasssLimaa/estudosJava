package mediaTurma;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nomes[] = new String[5];
		double notas[] = new double[5];
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite o nome do aluno: " + (i + 1));
			nomes[i] = scan.nextLine();
		}
		for(i = 0; i < 5; i++) {
			System.out.println("Digite a nota de: " + nomes[i]);
			notas[i] = scan.nextDouble();
		}
		
		System.out.println("Medias dos alunos: " + media(notas));
		acimaDaMedia(nomes, notas);
		
	}
	
	public static double media(double notas[]) {
		
		double media;
		double somaNotas = 0;
		
		for(int i = 0; i < 5; i++) { 
			somaNotas += notas[i];
		}
		
		media = somaNotas / notas.length;
		
		return media;
	}
	
	public static void acimaDaMedia(String nomes[], double notas[]) {
		
		for(int i = 0; i < 5; i++) {
			if(notas[i] > media(notas)) {
				System.out.println(nomes[i] + " esta acima da media");
			}
		}
	}
}





