import java.util.Locale;
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a;
		int x;
		double y;
		char z;
		System.out.println("Digite um nome: ");
		a = sc.next();
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		System.out.println("Digite um número flutuante: ");
		y = sc.nextDouble();
		System.out.println("Digite um número palavra: ");
		z = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		System.out.printf("Você digitou: %.2f%n",  y);
		System.out.println("Você digitou: " + z);
		System.out.println("Você digitou: " + a);
		
		String n;
		int i;
		double aa;
		System.out.println("Digite seu nome, idade, altura");
		n = sc.next();
		i = sc.nextInt();
		aa = sc.nextDouble();
		
		
		System.out.println("Dados digitados: ");
		System.out.println(n);
		System.out.println(i);
		System.out.println(aa);

		
		
		sc.close();
		

	}

}
