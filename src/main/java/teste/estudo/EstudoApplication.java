package teste.estudo;

import java.util.Scanner;

public class EstudoApplication {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double lado, area;
		System.out.print("Informe o lado do quadrado para calcular sua área: ");
		lado = ler.nextInt();
		area = Math.pow(lado,2);
		System.out.print("A área do quadrado informado é: " + area + " metros. Dobrando esse área então teremos " + area * 2 + "metros.");
	}
}
