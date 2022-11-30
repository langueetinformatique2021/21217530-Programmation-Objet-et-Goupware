package atelier8;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10000, j;
		try {
			do {
				i--;
				j = 1 / i;
			} while (true);
		}	
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
