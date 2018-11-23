package mediathequeback.tools;

public class Connexion {

	/** Constructeur privé */
	private Connexion() {

	}

	/** Instance unique non préinitialisée */
	private static Connexion INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
	public static Connexion getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Connexion();
		}
		return INSTANCE;
	}
}
