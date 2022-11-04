package conditions;

public class ETUDIAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Promotion promo23 = new Promotion("Promotion 2023", "2023");
        Etudiant etudiant = new Etudiant("SOKENG", "Jordanne", promo23);
        promo23.debuter();
        etudiant.etudier();
        etudiant.seReposer();
        promo23.reussir();
	}

};
/**
 * It's a class that represents a student
 */
class Etudiant {
    private int id;
    private String matricule;
    private String nom;
    private String prenom;
    private String classe;
    private Promotion promotion;

    // It's a constructor
    public Etudiant(String nom, String prenom, Promotion promotion) {
        this.nom = nom;
        this.prenom = prenom;
        this.promotion = promotion;
    }

    public Etudiant(int id, String matricule, String nom, String prenom, Promotion promotion) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.promotion = promotion;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    /**
     * The function etudier() prints the name of the student followed by the text 'se met au travail'
     */
    public void etudier() {
        System.out.println(this.nom + " se met au travail !");
    }

    /**
     * The function seReposer() prints the name of the student followed by the text 'se repose'
     */
    public void seReposer() {
        System.out.println(this.nom + " se repose");
    }
};


/**
 * It's a class that represents a promotion
 */
class Promotion {
    private int id;
    private String nom;
    private String annee;

    public Promotion(String nom, String annee) {
        this.nom = nom;
        this.annee = annee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void debuter() {
        System.out.println("La promotion " + this.nom + " a debuté les cours !");
    }

    public void reussir() {
        System.out.println("La promotion " + this.nom + " a reussie !");
    }
};
;
