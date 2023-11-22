package exercicioManzano;

public class ExercicioManzano07 {

	public static void main(String[] args) {
		
		  int i=2;
		     int antecessor=0, atual=1;
		     int sucessor=0;
		     
		     System.out.println("Os 15 primeiros numeros da sequencia de fibonacci são: ");
		    
		      while(i<15){
		        sucessor=antecessor+atual;
		        antecessor=atual;
		        atual=sucessor;
		        i++;
		        System.out.println(sucessor);
		      }
	}
}