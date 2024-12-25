import java.util.Locale;
import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Saiba qual o valor do terreno e qual o preço.");
		
		System.out.println("Qual a largura do terreno? ");
		double L = sc.nextDouble();
		System.out.println("Qual o comprimento do terreno? ");
		double C = sc.nextDouble();
		double vm = sc.nextDouble();
		double area = L * C;
		double preco = area * vm;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}

}
