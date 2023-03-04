package org.TP3.tableau;

public class PileTableau implements Tableau {

    private Object t[];
    private int sommet; // sommet de la pile

    public PileTableau(int n) // constructeur
    {
        t = new Object[n]; // creer le tableau qui contiendra la pile
        sommet = -1; // pas d'éléments dans la pile
    }


    @Override
    public void empiler(Object ob) {
        //regarder si sommet = -1;
        //sinon regarder si suivant somment possible
    }

    @Override
    public Object depiler() {
        t[sommet] = null;
        t[sommet - 1] = sommet;
        return sommet;
    }

    @Override
    public Object lireSommet() {
        return sommet;
    }

    @Override
    public boolean pileVide() {
        if (t[0] == null) {
            return true;
        } else return false;
    }

    @Override
    public int taille() {
        return sommet;
    }

    @Override
    public void afficherPile() {
        for (int i = 0; i <= sommet; i++) {
            System.out.println("element n° " + i + " : " + t[i]);
        }
    }
}
