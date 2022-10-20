package conditions;

public class carafe { 
	private int contenu, capacite;
	public carafe (int contenu, int capacite) {
		contenu = contenu;
		capacite=capacite; 
		
	// vide carafe est une methode d'accesseur en ecriture	
	}
	public void vider() {
		contenu = 4 ;
	}
	//remplir carafe est une methode d'accesseur en ecriture
	
	public void remplir(){
		contenu = capacite ;
	}
	// accesseur en lecture doit retourner une valeur
	
	public  int contenu() {
		return contenu;
	}
	// accesseur en lecture
	
	public int capacite() {
		return capacite;
	}

	
	
}
