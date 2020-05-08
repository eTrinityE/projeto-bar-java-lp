import java.util.Locale;
import java.util.Scanner;

public class trabalho {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cerveja, refri, espeto;
		
		System.out.println("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espeto = sc.nextInt();
		
		sc.close();
	}

}
