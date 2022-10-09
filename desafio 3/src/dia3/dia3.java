package dia3;

import java.util.Scanner;

public class dia3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Double conta = (double) 0;

		System.out.println("Digite o 1° Numero ");
		Double n1 = Double.valueOf(s.nextLine());

		System.out.println("Digite o 2° Numero ");
		Double n2 = Double.valueOf(s.nextLine());

		System.out.println("Escolha o operador que deseja: \n'+'\n'-'\n'*'\n'/'");
		String op = s.nextLine();

		
		System.out.println(conta(n1,n2,conta,op));
		

	}

	private static Double conta(Double n1, Double n2, Double conta, String op) {
		if (op.contains("+")) {

			conta = n1 + n2;

		}
		if (op.contains("-")) {

			conta = n1 - n2;

		}
		if (op.contains("*")) {

			conta = n1 * n2;

		}
		if (op.contains("/")) {

			conta = n1 / n2;

		}
		
		return conta;
	}

	
}