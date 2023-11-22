package exercicioManzano;

public class ExercicioManzano03 {

	public static void main(String[] args) {
		int somatorio=0;
		
		for (int i = 0; i <= 500; i++) {
			if(i%2==0) {
			somatorio=somatorio+i;
			}
			
		}
		System.out.println("A soma dos valores pares de 0 a 500 é: "+somatorio);
	}

}
