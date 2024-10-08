package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {

    /**
     * Cette commande permet de mettre en majuscules une partie du texte du document
     */
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;début;fin;");
            return;
        }
        try
        {
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);

            this.document.majuscules(debut, fin);
            super.executer();
        }
        catch (NumberFormatException e)
        {
            System.err.println("Début et fin doivent être des nombres");
            return;
        }
    }
}
