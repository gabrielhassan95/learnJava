import java.util.Locale;

public class Exe_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá Mundo!");
		int idade = 29;
		double altura = 1.735;
		String nome ="Gabriel";
		double renda = 10.000;
		System.out.printf("%.2f%n",altura);
		System.out.println(idade);
		System.out.println(altura);
		Locale.setDefault(Locale.US);
		System.out.println(idade);
		System.out.printf("%.2f%n",altura);
		System.out.printf("RESULTADO = %.2f metros%n ", altura );
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
	}

}
