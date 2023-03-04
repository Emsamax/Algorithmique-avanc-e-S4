package org.TP1;

public class ListeTableau implements Liste{

    class Maillon
    {
        Object info;
        int suivant;
        Maillon(Object ob, int i) // constructeur
        {
            info = ob;
            suivant = i;
        }
    }

    int MAXTAILLE; // nbr maximum de Maillons dabs la liste
    Maillon liste[]; // creer une liste sous forme de tableau
    int tete, nbrElements; // nbrElements: nombre de maillons
    //à un moment donné dans la liste

    ListeTableau( int s) // constructeur
    {
        MAXTAILLE = s;
        liste = new Maillon[MAXTAILLE];
    }


    @Override
    public void initialiserListe() {
        MAXTAILLE = 0;
        tete = 0;
        nbrElements = 0;
    }

    @Override
    public void creerListe(int n) {
        for (int i = 0; i < n; i++) {
            liste = new Maillon[i];
            nbrElements++;
        }
    }

    @Override
    public void insererDebut(Object ob) {
        Maillon s = new Maillon(ob,1);
        liste[0] = s;
        liste[s.suivant] = liste[0];
    }

    @Override
    public void insererApres(Object obNew, Object ob) {

    }

    @Override
    public Object supprimerDebut() {
        return null;
    }

    @Override
    public Object supprimerApres(Object ob) {
        return null;
    }

    @Override
    public boolean listeVide() {
        if(nbrElements != 0){
            return false;
        }
        return true;
    }

    @Override
    public int taille() {
        return MAXTAILLE;
    }

    @Override
    public void afficher() {
        for (int i = 0; i < MAXTAILLE; i++) {
            System.out.println(liste[i]);
        }
    }

}
