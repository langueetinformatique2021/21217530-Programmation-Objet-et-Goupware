package atelier9;
import java.io.*;
public class nomTexte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	        FileWriter fw = new FileWriter("noms.txt");
	        fw.write("Hello, Welcome to WayToLearnX!");
	        fw.close();
	        System.out.println("sokeng jordanne");
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	}

}
