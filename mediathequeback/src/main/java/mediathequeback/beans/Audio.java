package mediathequeback.beans;

public class Audio extends Media{
	
	int duree;

	public Audio(String titre, String genre, String createur, String dateSortie, int nbExemplaires, String descriptif,
			String commentaire, int duree) {
		super(titre, genre, createur, dateSortie, nbExemplaires, descriptif, commentaire);
		this.duree = duree;
		// TODO Auto-generated constructor stub
	}
	
	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void jouer() {
		System.out.println("Play");
	}
	
	public void pause() {
		System.out.println("Pause");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
}
