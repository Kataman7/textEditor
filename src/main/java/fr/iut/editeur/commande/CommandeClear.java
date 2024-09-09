package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        new CommandeRemplacer(document, new String[]{"0", ""+this.document.getTexte().length(), "oups"}).executer();
    }


}
