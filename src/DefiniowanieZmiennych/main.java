package DefiniowanieZmiennych;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
private static int check=1;
	public static void main(String[] args) {
		double[] tab = new double[3];;		

		System.out.println("Podaj 3 liczby: ");
		Scanner in = new Scanner(System.in);
		while(check<=3)		
		try {
			
			System.out.println("Liczba "+check+":");
			tab[check-1]=in.nextDouble();
			check++;
		}catch(InputMismatchException ex) {
			System.out.println("Nie podales liczby");
			in.nextLine();		
	}
		DefiniowanieZmiennych df = new DefiniowanieZmiennych(tab[0],tab[1],tab[2]);		

	System.out.printf("%.2f",df.sumVarDef());
	}
}


