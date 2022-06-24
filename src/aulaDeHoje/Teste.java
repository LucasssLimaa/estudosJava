package aulaDeHoje;

public class Teste {
	
	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora();
		Calculadora calc2 = new Calculadora();
		
		calc1.a = 10;
		calc2.a = 20;
		calc2.b = 13;
		calc2.b = 23;
		
		System.out.println(calc1.a);
		System.out.println(calc2.a);
		System.out.println(calc1.b);
		System.out.println(calc2.b);
		
		/*System.out.println(Calculadora.media(9, 6));
		System.out.println(Math.random() * 10);*/
	}
}
