package exercicioManzano;

import java.util.Scanner;

public class ExercicioManzano09 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int i=1,soma=0;
		
		
		while(i<=10) {
			System.out.println("Digite o "+i+" valor: ");
			int valor=sc.nextInt();
			soma=soma+valor;
			i++;
		
		}
		
		double media=soma/10;
      System.out.println("O valor da soma dos números é: "+soma+ " e a media dos números é :"+media);
	}

}
