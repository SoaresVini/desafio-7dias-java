package dia2;

import java.util.Scanner;

public class dia2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		Integer[] num = new Integer[3];
		Integer j = 0;
		

		for (int i = 0; i < num.length; i++) {

			j++;
			
			System.out.println("Digite o número "+j+":" );
			Integer n = Integer.valueOf(s.nextLine());

			num[i] = n;
		}
		j=0;
		
		System.out.println("Os números digitados pelo usurio foram:\n");
	
		for (int i = 0; i < num.length; i++) {
			
			j++;
		
			System.out.println("número "+j+" = "+num[i] );
			
		
		}

		}

		

}
