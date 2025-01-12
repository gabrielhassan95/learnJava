import java.util.Scanner;

public class Exe_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		int x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha Inválida, tente novamente!");
			x = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
