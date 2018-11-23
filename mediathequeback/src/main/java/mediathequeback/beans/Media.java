package mediathequeback.beans;

public abstract class Media {	  
	protected String titre;
	protected String genre;
	protected String createur;
	protected String dateSortie;
	protected int nbExemplaires;
	protected String descriptif;
	protected String commentaire;

	//Constructeur par défaut
	public Media(){
		System.out.println("Test Contructeur par défaut média");
	}

	//Constructeur avec paramètres
	//J'ai ajouté un « p » en première lettre des paramètres.
	public Media(String titre, String genre, String createur, String dateSortie, int nbExemplaires, String descriptif, String commentaire)
	{
		System.out.println("Saisissez votre nouveau Media: ");
		this.titre = titre;
		this.genre = genre;
		this.createur = createur;
		this.dateSortie = dateSortie;
		this.nbExemplaires = nbExemplaires;
		this.descriptif = descriptif;
		this.commentaire = commentaire;
	}   

	// Methodes              
	@Override
	public String toString() {
		return "Media : titre=" + titre + ", genre=" + genre + ", createur=" + createur + ", dateSortie=" + dateSortie
				+ ", nbExemplaires=" + nbExemplaires + ", descriptif=" + descriptif + ", commentaire=" + commentaire + "]";
	}
	//getters and setters
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public void setNbExemplaires(int nbExemplaires) {
		this.nbExemplaires = nbExemplaires;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}	

}

