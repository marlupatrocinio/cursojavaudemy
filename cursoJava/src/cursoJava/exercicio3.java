package cursoJava;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		 */
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println("DIFERENCA = " + (A * B - C * D));
		
		sc.close();
		
	}

}
