package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do Funcioário
		
		//Tipos númerios inteiros
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long PontosAcumulados = 3_234_845_223L/*long*/;
		
		//Tipos numéricos reais
		float Salario = 11_445.44F/*float*/;
		double VendasAcumuladas = 2_991_797_103.01;
		
		//Booleano
		boolean EstaDeFerias = false; //true
		
		//Tipo catactere
		char Status = 'A'; // Ativo
		
		//Dias de Empresa
		System.out.println(AnosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(NumeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(PontosAcumulados / VendasAcumuladas);
		
		
		System.out.println(id + ": ganha -> " + Salario);
		System.out.println("Férias? " + EstaDeFerias);
		System.out.println("Status: " + Status);
	}

}
