package fr.iut.editeur.document;

/**
 * Cette classe représente un document texte
 */
public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Cette méthode permet de remplacer une partie du texte par un autre texte. Elle est utilisé pour créer de nombreuses commandes.
     * @param debut l'indice du début de la partie à remplacer
     * @param fin l'indice de fin de la partie à remplacer
     * @param remplacement le texte qui remplacera la partie
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Cette méthode permet de mettre en majuscules une partie du texte.
     * @param debut l'indice du début de la partie à mettre en majuscules
     * @param fin l'indice de fin de la partie à mettre en majuscules
     */
    public void majuscules(int debut, int fin) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        String partieMilieuMajuscule = texte.substring(debut, fin + 1).toUpperCase();
        texte = partieGauche + partieMilieuMajuscule + partieDroite;
    }

    /**
     * Cette méthode permet d'afficher le texte du document
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
