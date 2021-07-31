package numeroPrimo;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int inicio, fim, contador = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o intervalo de verificação dos numeros primos: ");
		inicio = sc.nextInt();
		fim = sc.nextInt();

		for (int i = inicio; i <= fim; i++) {

			if (i == 0) {
			System.out.println(i);
			} else

				for (int x = 1; x <= i; x++) {
					if (i % x == 0) {
					contador += 1;
					}
				}

			if (contador == 2) {
			System.out.println(i);
			}
			contador = 0;
		}

		sc.close();

	}

}
