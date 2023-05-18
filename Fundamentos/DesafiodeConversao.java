package Fundamentos;

import java.util.Scanner;

/* public class DesafiodeConversao {
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Informe o seu primeiro salario: ");
		float s1 = e.nextFloat();
		System.out.println("Informe o seu segundo salario: ");
		float s2 = e.nextFloat();
		System.out.println("Informe o seu terceiro salario: ");
		float s3 = e.nextFloat();
		
		final float media = (s1 + s2 + s3) / 3;
		
		System.out.println("A média salarial é de: " + media);
		
		e.close();
  	}

} */

public class DesafiodeConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o segundo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o terceiro salário: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média dos salários é: " + media);
		
		entrada.close();
		
		
		}
}
