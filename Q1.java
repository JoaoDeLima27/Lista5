import java.util.Scanner;

public class Main {
	public static int inverter(int num) {
		String strNum = String.valueOf(num);
		StringBuilder sb = new StringBuilder(strNum);
		sb.reverse();
		int invertido = Integer.parseInt(sb.toString());
		return invertido;
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = a.nextInt();
		int numeroInvertido = inverter(numero);

		System.out.println("O número com os dígitos invertidos C): " + numeroInvertido);

		a.close();
	}
}