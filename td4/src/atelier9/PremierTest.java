package atelier9;


/**
 * écrire dans le fichier texte « Nom.txt » le prénom et le nom
 * 
 */
import java.io.FileWriter;
import java.io.IOException;
public class PremierTest {

	public static void fileWriterMethod(String filepath, String content) throws IOException  {
		// TODO Auto-generated method stub
		try (FileWriter fileWriter = new FileWriter(filepath)) {
			fileWriter.append(content);
		}
	}

	public static void main(String[] args) throws IOException {
		fileWriterMethod("/Users/jordannen/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt", "sokeng");
	}

}
