package atelier9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;




public class décompresse {

	public static void main(String[] args) {
		//*** TODO Auto-generated method stub
		final String OUTPUT_FOLDER = "javv - ZIP archive";
		String FILE_PATH = "javv.zip";

		// Créez le dossier Output
		File folder = new File(OUTPUT_FOLDER);
		if (!folder.exists()) {
			folder.mkdirs();
		}
		// Créez un buffer.
		byte[] buffer = new byte[1000];

		ZipInputStream zipIs = null;
		try {
			// Créez un objet ZipInputStream pour lire les fichiers à partir d'un chemin (path).
			zipIs = new ZipInputStream(new FileInputStream(FILE_PATH));

			ZipEntry entry = null;
			// Parcourir chaque Entry (de haut en bas jusqu'à la fin)
			while ((entry = zipIs.getNextEntry()) != null) {
				String entryName = entry.getName();
				String outFileName = OUTPUT_FOLDER + File.separator + entryName;
				System.out.println("Unzip: " + outFileName);

				if (entry.isDirectory()) {
					// Créer des dossiers.
					new File(outFileName).mkdirs();
				} else {
					// Créez un Stream pour graver des données dans le fichier.
					FileOutputStream fos = new FileOutputStream(outFileName);

					int len;
					// ​​​​​​​
					// Lisez les données sur Entry présent
					while ((len = zipIs.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					} 
					fos.close();
				} 
			}
		} catch (Exception a) {
			a.printStackTrace();
		} finally {
			try {
				zipIs.close();
			} catch (Exception a) {
			}
		}

	}

}
