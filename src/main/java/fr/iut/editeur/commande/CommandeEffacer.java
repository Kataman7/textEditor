package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {

    /**
     * Cette commande permet d'effacer du texte du document
     */
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;début;fin;");
            return;
        }
        new CommandeRemplacer(document, new String[]{"remplacer", parameters[1], parameters[2], ""}).executer();
    }
}
