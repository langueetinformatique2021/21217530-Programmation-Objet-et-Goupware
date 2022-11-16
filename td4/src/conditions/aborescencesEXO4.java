package conditions;

public class aborescencesEXO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	public abstract class animaaux {
			private String espèce;
			private int nb_pattes = 0;

			/**
			 * création d'une nouvelle instance de la classe Animal
			 * 
			 * @param type   nom de l'espèce
			 * @param pattes nombre de pattes
			 */
	        public Animal(String type, int pattes) {
				espèce = type;
				nb_pattes = pattes;
			}

			/** présentation des caractéristiques de l'animal */
			public void présente() {
				System.out.println("je suis un représentant de l'espèce des " + espèce + " et j'ai " + nb_pattes + " pattes");
			}

			/** cri de l'animal */
			public abstract void crie();
		// abstract une fonction qui n'a pas de code, elle ne peut donc pas s'éxecuter
		}
		
		

	}

}
