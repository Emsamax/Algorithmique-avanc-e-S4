package org.TP1;

public class ListeChaineeTest {
    public static void main(String[] args) {
        ListeChainee listesimple = new ListeChainee();
        listesimple.initialiserListe();
        listesimple.afficher(); // afficher la liste
        listesimple.creerListe(8); // creer 4 maillon
        listesimple.afficher(); // afficher la liste
        System.out.print("\nInserer au début 45:");
        listesimple.insererDebut(45);
        listesimple.afficher();
        System.out.print("\nInserer 50 après 35:");
        listesimple.insererApres(50, 35); // inseerer 66 apres 33
        listesimple.afficher();
        Object item = listesimple.supprimerDebut();
        if (item != null) {
            System.out.print("\nMaillon supprimé: " + item);
            listesimple.afficher();
        }
        item = listesimple.supprimerApres(25); // supprimer le maillon apres le maillon 25
        System.out.print("\nMaillon supprimé : " + item);
        listesimple.afficher();
        System.out.println("\ntaille(): " + listesimple.taille());
    }
}

