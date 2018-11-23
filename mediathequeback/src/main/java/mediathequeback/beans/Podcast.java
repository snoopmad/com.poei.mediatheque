package mediathequeback.beans;

public class Podcast extends Audio {
	
	int chapitre;

	public Podcast(String titre, String genre, String createur, String dateSortie, int nbExemplaires, String descriptif,
			String commentaire, int duree, int chapitre) {
		super(titre, genre, createur, dateSortie, nbExemplaires, descriptif, commentaire, duree);
		this.chapitre = chapitre;
		// TODO Auto-generated constructor stub
	}

	public int getChapitre() {
		return chapitre;
	}

	public void setChapitre(int chapitre) {
		this.chapitre = chapitre;
	}



}
