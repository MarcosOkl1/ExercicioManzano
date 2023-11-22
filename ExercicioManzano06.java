package exercicioManzano;

import java.util.Scanner;

public class ExercicioManzano06 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da base: ");
	        double b = scanner.nextDouble();

	        System.out.print("Digite o valor do expoente: ");
	        int exp = scanner.nextInt();

	        double resultado = Math.pow(b, exp);
	        System.out.println(b + "^" + exp + " = " + resultado);

	        scanner.close();
		}
	       
}


