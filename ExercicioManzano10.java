package exercicioManzano;

public class ExercicioManzano10 {

	public static void main(String[] args) {
		
		int soma=0,i=50,pares=0;
	
		while (i<=70) {
			if(i%2==0) {
			soma=soma+i;
			pares++;
			
	}
			i++;

}
		System.out.println("A soma dos numeros pares entre 50 e 70 é: "+soma+ " e a media desses valores é :"+soma/pares);
	}
}
