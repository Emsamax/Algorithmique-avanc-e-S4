package org.TP3;

public class PileListeChainee implements Pile {
    Maillon current;
    Maillon head; // sommet de la pile, maillon courant.
    //Maillon current; // maillon courant
    Maillon first = null;

    PileListeChainee(Object firstMaillon) {
        Maillon m = new Maillon(firstMaillon);
        first = m;
        //current = m;
        head = m;
    }

    @Override
    public void empiler(Object ob) {
        current = head;
        Maillon newMaillon = new Maillon(ob);
        current.suivant = head;
        head = newMaillon;
    }

    @Override
    public Object depiler() {
        return null;
    }

    @Override
    public Object lireSommet() {
        return head.getElement();
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
        System.out.println("maillon n°" + 0 + " : " + first.getElement());
        for (int i = 1; i < 3; i++) {
            System.out.println("maillon n°" + i + " : " + current.getElement());
            i++;
        }
    }
}

class Maillon {
    boolean head, current;

    private Object element; // element de donnee
    Maillon suivant; // prochain maillon dans la liste chainee

    Maillon(Object e) // constructeur
    {
        element = e; // le prochain est automatiquement mis à null
    }

    public Object getElement(){
        return this.element;
    }
}

