package mediathequeback.beans;

public class Musique extends Audio{
	
	private String compositeur;
	private String maisonDeDisque;

	public Musique(String titre, String genre, String createur, String dateSortie, int nbExemplaires, String descriptif,
			String commentaire, int duree,String compositeur, String maisonDeDisque) {
		super(titre, genre, createur, dateSortie, nbExemplaires, descriptif, commentaire, duree);
		this.compositeur = compositeur;
		this.maisonDeDisque = maisonDeDisque;
		// TODO Auto-generated constructor stub
	}

	public String getCompositeur() {
		return compositeur;
	}

	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

	public String getMaisonDeDisque() {
		return maisonDeDisque;
	}

	public void setMaisonDeDisque(String maisonDeDisque) {
		this.maisonDeDisque = maisonDeDisque;
	}

}
