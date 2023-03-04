package org.TP1;

public interface Liste {

    void initialiserListe();

    void creerListe(int n);

    void insererDebut(Object ob);

    void insererApres(Object obNew, Object ob);

    Object supprimerDebut();

    Object supprimerApres(Object ob);

    boolean listeVide();

    int taille();

    void afficher();

}
