package atelier8;

public class pileface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aleatoire a = new Aleatoire(2);
		
		print(tire(a));
				
		int i = 0, p = 0;
		double n = 1000.0;
		do {i ++; p += tire(a);} while (i < n);
		print(p / n);
	}
	
	
	 public static void print(Object o) {System.out.println(o);}
	 public static int tire(Aleatoire a) {
		return (a.get() > 1) ?  1 : 0;
	}

}
