package mediathequeback.beans;

//@TODO  cc dans mediatheque + extends media
public class Livre extends Media{

	private int nbPage;
	private String editeur;
	private int nbChapitre;

	//constructor
	public Livre(String titre, String genre, String createur, String dateSortie, int nbExemplaires, String descriptif,
			String commentaire,int nbPage, String editeur, int nbChapitre) {
		super(titre, genre, createur, dateSortie, nbExemplaires, descriptif, commentaire);
	
		this.nbPage = nbPage;
		this.editeur = editeur;
		this.nbChapitre = nbChapitre;
	}

	//getter and setter
	public int getNbPage() {
		return nbPage;
	}

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getNbChapitre() {
		return nbChapitre;
	}

	public void setNbChapitre(int nbChapitre) {
		this.nbChapitre = nbChapitre;
	}

	//methods

	@Override
	public String toString() {
		return "Ce livre contient " + nbPage + " page(s), il est �dit� par " + editeur + " et contient " + nbChapitre + " chapitres.";
	}

	public void lecture() {
		System.out.println("mode lecture a definir");
	}

	public boolean sauvegarderPageEnCours() {
//		try {
//			System.out.println("votre page a bien �t� sauvegard�e");
//		}
//		catch(SQLException e){
//			System.out.println("erreur de sauvegarde: " + e.getErrorCode());
//		}
		return true;
	}
}
