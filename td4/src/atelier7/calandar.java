package atelier7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class calandar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    Date date = new Date();
		    System.out.println(s.format(date));
	}

}
