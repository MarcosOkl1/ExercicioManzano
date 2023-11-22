package exercicioManzano;

import java.util.Scanner;

public class ExercicioManzano11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nome = scanner.next();

            System.out.print("Digite a largura: ");
            double larg = scanner.nextDouble();

            System.out.print("Digite o comprimento: ");
            double compri = scanner.nextDouble();

            
            double area = larg * compri;
            System.out.println("Área do " + nome + ": " + area + " metros quadrados");

           
            total += area;

            
            System.out.print("Deseja contitunar o calculo com outro cômodo ?: ");
            resposta = scanner.next().toUpperCase();

        } while (!resposta.equals("nao"));

        
        System.out.println("Área total da casa é de: " + total + " metros quadrados");

        scanner.close();

}
}
