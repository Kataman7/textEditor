package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

/**
 * Cette classe permet de créer des commandes en fonction de leur nom
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * Cette méthode permet de créer une commande en fonction de son nom
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscules(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "clear" : return new CommandeClear(document, parameters);
            default: return null;
        }
    }

}
