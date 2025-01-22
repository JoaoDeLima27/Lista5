public class Main {
	public static int product(int[] numbers) {
		if (numbers.length == 0) {
			return 0;
		}

		int result = 1;
		for (int number : numbers) {
			result *= number;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Teste 1: Array vazio");
		System.out.println("Resultado: " + product(new int[] {})); // Array vazio

		System.out.println("\nTeste 2: Array com um nC:mero [5]");
		System.out.println("Resultado: " + product(new int[] {5})); // Array com um nC:mero

		System.out.println("\nTeste 3: Array com vC!rios nC:meros [2, 3, 4]");
		System.out.println("Resultado: " + product(new int[] {2, 3, 4})); // Array com vC!rios nC:meros

		System.out.println("\nTeste 4: Array com zero [0, 1, 2]");
		System.out.println("Resultado: " + product(new int[] {0, 1, 2})); // Array com zero
	}
}
