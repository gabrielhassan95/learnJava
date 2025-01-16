import java.util.Locale;
import java.util.Scanner;

public class Exe_19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a coordenada de X e Y:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		sc.close();

	}

}
