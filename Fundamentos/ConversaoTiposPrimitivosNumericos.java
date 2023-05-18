package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		/* Conversão implicita*/
		double a = 1;
		System.out.println(a);
		
		/*Conversão explicita ou cast*/
		float b = (float) 1.12345;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão explicita (cast)
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;
		System.out.println(f);
		
		
	}

}
