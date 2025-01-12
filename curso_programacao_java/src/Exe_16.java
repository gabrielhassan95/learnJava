import java.util.Scanner;

public class Exe_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double desconto = (x < y) ? x * 0.1 : y * 0.05;
		
		System.out.println(desconto);
		
		
		
		
		
		sc.close();
	}

}
