package atelier7;
import java.util.Scanner;


public class cercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * calculee la surface d'un cercle
		 * 
		 */
		int rayon;
        double surface, pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le rayon du cercle : ");
        rayon = scanner.nextInt();
        surface = pi * rayon * rayon;
        System.out.println("La surface du cercle est : "+surface);
	}
	

}
