/*2. Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. 
 Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada. 
 Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).*/

package mediaTurma2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNotas;
		
		System.out.println("Digite quantas notas serao inseridas: ");
		quantidadeNotas = scan.nextInt();
		
		double notas[] = new double[quantidadeNotas];
		
        for(int i = 0; i < notas.length; i++) {
        	System.out.println("Digite a nota " + (i + 1) + ": ");
        	notas[i] = scan.nextDouble();
		}
        
        System.out.println("Media das notas: " + mediaNotas(notas));
        System.out.println("Notas acima da media: " + acimaMedia(notas));
        System.out.println("Notas abaixo da media: " + abaixoMedia(notas));
	}
	
	public static double mediaNotas(double notas[]) { 
		
		double media;
		double somaNotas = 0;
		
		for(int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}
		
		media = somaNotas / notas.length;
		return media;
	}
	
	public static double acimaMedia(double notas[]) {
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] > mediaNotas(notas)) {
				return notas[i];
			}
		}
		
		return 0;
	}
	
    public static double abaixoMedia(double notas[]) {
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < mediaNotas(notas)) {
				return notas[i];
			}
		}
		
		return 0;
	}
}