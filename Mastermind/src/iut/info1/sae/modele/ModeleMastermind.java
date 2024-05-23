package iut.info1.sae.modele;

public class ModeleMastermind {

    // TODO : definir toutes les couleurs
    private static final String[] COULEURS = {""};

    // initialisation des constantes
    final int TAILLE_COMBINAISON = 4;
    final int NOMBRE_MAX_DE_COUP = 12;

    // initialisation des variables
    int nbDeCoup = 0;
    int nbDeManche = 0;
    int nbDeCouleurMalPlace;
    int nbDeCouleurBienPlace;
    String[] combinaisonCouleurJ1 = new String[TAILLE_COMBINAISON];
    String[] combinaisonCouleurJ2 = new String[TAILLE_COMBINAISON];
    boolean finPartie = false;


    // combinaison que le joueur 1 choisi
    combinaisonCouleurJ1[0] = "bleu";
    combinaisonCouleurJ1[1] = "rose";
    combinaisonCouleurJ1[2] = "blanc";
    combinaisonCouleurJ1[3] = "bleu";

    // le tableau de base devra etre vide et c'est le joueur qu choisira les couleurs

    while (!finPartie) {
        // Selection des couleurs pour le J2
        // TODO : selectionner les couleurs en cochant les cases dans une liste deroulante sur chaque cases vide
        
        // a suprimer des que le TODO du dessus est fait
        combinaisonCouleurJ2[0] = "bleu";
        combinaisonCouleurJ2[1] = "rose";
        combinaisonCouleurJ2[2] = "blanc";
        combinaisonCouleurJ2[3] = "bleu";

        // verification d'une potentielle fin de manche
        if (nbDeCouleurBienPlace == TAILLE_COMBINAISON) {
            finPartie = true;
        } else {
            nbDeCoup++;
            if (nbDeCoup==NOMBRE_MAX_DE_COUP) {
                finPartie = true;
            }
        }
            
    }
}