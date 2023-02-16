package org.TP2;

public class PileListeChainee implements Pile{
    @Override
    public void empiler(Object ob) {
        
    }

    @Override
    public Object depiler() {
        return null;
    }

    @Override
    public Object lireSommet() {
        return null;
    }

    @Override
    public boolean pileVide() {
        return false;
    }

    @Override
    public int taille() {
        return 0;
    }

    @Override
    public void afficherPile() {

    }

    class Maillon
        {
            Object element; // element de donnee
            Maillon suivant; // prochain maillon dans la liste chainee
            Maillon( Object e ) // constructeur
            {
                element = e; // le prochain est automatiquement mis à null
            }
        }
        Maillon sommet; // sommet de la pile
        Maillon p; // maillon courant

    }

