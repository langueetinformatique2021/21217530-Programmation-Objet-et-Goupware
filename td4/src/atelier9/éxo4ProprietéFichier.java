package atelier9;

import java.io.FileInputStream;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class éxo4ProprietéFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FILE_PATH = "les_misérables.jar"; 
		JarInputStream zipIs = null;
		try {
			// Créer un objet JarInputStream pour lire le fichier jar.
			zipIs = new JarInputStream(new FileInputStream(FILE_PATH)); 
			// Lire les informations de Manifest :
			Manifest manifest = zipIs.getManifest();
			Attributes atts = manifest.getMainAttributes();
			String version = atts.getValue("Manifest-Version");
			String createdBy = atts.getValue("Created-By");
			System.out.println("Manifest-Version:" + version);
			System.out.println("Created-By:" + createdBy);
			System.out.println(" coucou "); 
			JarEntry entry = null;
			// Parcourir chaque Entry (de haut en bas jusqu'à la fin)
			while ((entry = zipIs.getNextJarEntry()) != null) {
				if (entry.isDirectory()) {
					System.out.print("Folder: ");
				} else {
					System.out.print("File: ");
				}
				System.out.println(entry.getName());
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				zipIs.close();
			} catch (Exception e) {
			}
		}
	}

}
