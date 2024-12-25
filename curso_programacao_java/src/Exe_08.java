import java.util.Scanner;

public class Exe_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro:");
		int n1 = sc.nextInt();
		System.out.println("Digite um valor inteiro:");
		int n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		sc.close();
	}

}
