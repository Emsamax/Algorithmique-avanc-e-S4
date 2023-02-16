package org.TP1;

public class ListeChainee implements Liste{

    class Maillon
    {
        Object info; // élément, item de donnée
        Maillon suivant; // fait reference au Maillon suivant dans la liste
        Maillon( Object ob ) // constructeur
        {
            info = ob;
            suivant = null;
        }
    }

    Maillon head; // le premier maillon de la liste.
    Maillon actual; //le maillon actuel.
    int nbElements = 0;

    @Override
    public void initialiserListe() {
        head = null;
        actual = null;
        nbElements = 0;
    }

    @Override
    public void creerListe(int n) {
        for (int i = 0; i < n; i++) {
            // content for the new Maillon.
            Maillon maillon = new Maillon(i);
            maillon.suivant = head;
            nbElements++;

        }
    }

    @Override
    public void insererDebut(Object ob) {
        actual = new Maillon(ob);
        actual.suivant = head;
        head = actual;
        nbElements ++;
    }

    @Override
    public void insererApres(Object obNew, Object ob) {
        actual  = new Maillon(ob);
        Maillon maillon = new Maillon(obNew);
        maillon.suivant = actual.suivant;
        actual.suivant = maillon;
        nbElements++;
    }

    @Override
    public Object supprimerDebut() {
        var t = head.info;
        head = head.suivant;
        nbElements--;
        return t;
    }

    @Override
    public Object supprimerApres(Object ob) {
        actual = new Maillon(ob);
        actual.suivant = actual;
        nbElements--;
        return actual.suivant;
    }

    @Override
    public boolean listeVide() {
        if(nbElements != 0){
            return false;
        }
        return true;
    }

    @Override
    public int taille() {
        return nbElements;
    }

    @Override
    public void afficher() {
        var temp = head;
        while(temp != null){
            System.out.println(head.info);
            temp = temp.suivant;
        }
    }
}
