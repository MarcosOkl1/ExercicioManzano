package exercicioManzano;

public class ExercicioManzano08 {
	public static void main(String[] args) {
	
	 System.out.println("Celsius   Fahrenheit");

     for (int celsius = 10; celsius <= 100; celsius += 10) {
         double fahrenheit = conversor(celsius);
         System.out.printf("%-9d  %-9.2f\n", celsius, fahrenheit);
     }
 }


 private static double conversor(int celsius) {
     return (9.0 * celsius + 160.0) / 5.0;

 }
}
