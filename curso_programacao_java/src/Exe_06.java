import java.util.Scanner;

public class Exe_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		sc.close();
	}

}
