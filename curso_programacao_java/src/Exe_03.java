import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();//ao usar qualquer "next" com nextLine, tem que colocar um nextLine vazio antes da próxima linha, pois essa linha a mais será consuminda pela next anterior tipo nextInt, nextDouble.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
