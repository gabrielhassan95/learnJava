import java.util.Scanner;

public class Exe_20_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 5830;
		senha = sc.nextInt();

		while (senha != 5830) {
				System.out.println("Senha Invalida");
				senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		sc.close();
	}

}
