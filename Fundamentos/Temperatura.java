package Fundamentos;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double F;
		System.out.println("Informe a temperatura em °F: ");
		F = e.nextDouble();
		
		final double conversao = (F - 32) * 5/9;
		
		System.out.println("A temperatura em °C é de: " + conversao);
		
		e.close();
	}
}
