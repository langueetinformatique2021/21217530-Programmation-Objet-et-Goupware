package atelier9;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.io.FileInputStream;

public class compresser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File fin = new File("les_misérables_vol._i_-_fantine.txt");
			FileInputStream fsource = new FileInputStream(fin);	
			byte[] tmp = new byte[(int)fin.length()];
			fsource.read(tmp);
			fsource.close();
			
	
			FileOutputStream fout = new FileOutputStream(
					new File("les_misérables_vol._i_-_fantine.zip"));
			DataOutputStream fcible = new DataOutputStream(new DeflaterOutputStream(fout));
			
			fcible.write(tmp);
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
