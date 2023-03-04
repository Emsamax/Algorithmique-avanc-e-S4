package org.TP3.tableau;

public interface Tableau {
        void empiler(Object ob);
        Object depiler();
        Object lireSommet();

        boolean pileVide();
        int taille();

        void afficherPile();

}
