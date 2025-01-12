import java.util.Locale;
import java.util.Scanner;

public class Exe_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("\n CODIGO  ESPECIFICAÇÃO		PREÇO"
				+ "\n 1	Cachorro Quente		R$ 4.00"
				+ "\n 2 	X-Salada		R$ 4.50"
				+ "\n 3	X-Bacon			R$ 5.00"
				+ "\n 4 	Torrada simples		R$ 2.00"
				+ "\n 5 	Refrigerante 		R$ 1.50");
		System.out.println("Escolha umas das opções entre 1 a 5: ");
		int codigo = sc.nextInt();
		System.out.println("Quantos você deseja?");
		int quantidade =  sc.nextInt();
		
		
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 4.00);
		}
		if (codigo == 2) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 4.50);
		}
		if (codigo == 3) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 5.00);
		}
		if (codigo == 4) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 2.00);
		}
		if (codigo == 5) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 1.50);
		}
		
		
		sc.close();
	}

}
