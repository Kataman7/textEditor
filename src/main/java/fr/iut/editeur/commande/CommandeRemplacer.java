package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;début;fin;texte");
            return;
        }
        try
        {
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);
            String texte = parameters[3];

            this.document.remplacer(debut, fin, texte);
            super.executer();
        }
        catch (NumberFormatException e)
        {
            System.err.println("Début et fin doivent être des nombres");
            return;
        }
    }
}
