package mediathequeback.beans;

public class SerieAudio extends Audio{
	
	int nbEpisode;
	int nbSaisons;

	public SerieAudio(String titre, String genre, String createur, String dateSortie, int nbExemplaires,
			String descriptif, String commentaire, int duree, int nbEpisode, int nbSaisons) {
		super(titre, genre, createur, dateSortie, nbExemplaires, descriptif, commentaire, duree);
		this.nbEpisode = nbEpisode;
		this.nbSaisons = nbSaisons;
		// TODO Auto-generated constructor stub
	}

	public int getNbEpisode() {
		return nbEpisode;
	}

	public void setNbEpisode(int nbEpisode) {
		this.nbEpisode = nbEpisode;
	}

	public int getNbSaisons() {
		return nbSaisons;
	}

	public void setNbSaisons(int nbSaisons) {
		this.nbSaisons = nbSaisons;
	}
	

}
