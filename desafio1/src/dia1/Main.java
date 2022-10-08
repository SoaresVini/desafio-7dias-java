//10. Faça um método que recebe dois números reais ℝ como 
//parâmetro e retorna a soma de ambos.
package dia1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Número 1:");
	Integer num1 = Integer.valueOf(s.nextLine());
	
	System.out.println("Número 2:");
	Integer num2 = Integer.valueOf(s.nextLine());
	
	System.out.println("Soma dos números lidos: " + calcSoma(num1, num2));
	}

	private static int calcSoma(Integer num1, Integer num2) {

		return num1 + num2;
	}

}