import java.util.Scanner;

public class Exe_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Selecione o combustível: \n"
				+ "\n1.Álcool"
				+ "\n2.Gasolina"
				+ "\n3.Diesel"
				+ "\n4.Fim"
				+ "\n=====================\n"
				);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1 ) {
				alcool = alcool +1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc .nextInt();
		}
		
		System.out.println("MUITO OBRIGADO" 
				+ "\n1.Álcool: " + alcool
				+ "\n2.Gasolina: " + gasolina
				+ "\n3.Diesel: " + diesel);
		
		
		sc.close();
		
	}

	
}
