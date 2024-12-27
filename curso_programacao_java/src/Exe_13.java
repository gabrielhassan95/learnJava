import java.util.Locale;
import java.util.Scanner;

public class Exe_13 {

	public static void main(String[] args) {
		double salario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o salário: ");
		salario = sc.nextDouble();
		Locale.setDefault(Locale.US);
		if (salario <= 2000) {
			System.out.println("Isento");
		}	
		
		else if (salario <= 3000 ) {
			System.out.printf("R$ %.2f%n", (salario - 2000) * 0.08 );
			
		}
		else if (salario <= 4500 ) {
			System.out.printf("R$ %.2f%n", (salario - 3000) * 0.18 + 1000 * 0.08 );
		}
		else {
			System.out.printf("R$ %.2f%n", (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08 );
		}
			sc.close();
		
	}

}
