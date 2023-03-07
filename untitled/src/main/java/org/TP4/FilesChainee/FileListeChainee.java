package org.TP4.FilesChainee;

import org.TP4.File;

public class FileListeChainee implements File {

    class Maillon
    {
        Object element; // element de donnee
        Maillon suivant; // prochain maillon dans la liste chainee
        Maillon( Object e ) // constructeur
        {
            element = e; // le prochain est automatiquement mis à null
        }
    }
    Maillon debut, fin;
    int nbElements;


    @Override
    public void enfiler(Object ob) {
        Maillon maillon = new Maillon(ob);
        if(debut == null){
            debut = maillon;
            fin = debut;
            nbElements ++;
        } else if (debut.suivant == null) {
            debut.suivant = maillon;
            fin = debut.suivant;
            nbElements ++;
        }
        fin.suivant = maillon;
        fin = fin.suivant;
        nbElements ++;
    }

    @Override
    public Object defiler() {
        Object result = debut.element;
        debut = debut.suivant;
        nbElements --;
        return result;
    }

    @Override
    public Object lireDebut() {
        return debut.element;
    }

    @Override
    public boolean fileVide() {
        if(nbElements == 0 ){
            return true;
        }
        else return false;
    }

    @Override
    public int taille() {
        return nbElements;
    }

    @Override
    public void afficherFile() {
        if(debut != null){
            Maillon courant = debut;
            for (int i = 0; i <nbElements ; i++) {
                if(courant != null){
                    System.out.print(courant.element + "|");
                    courant = courant.suivant;
                } else break;
            }
            System.out.println("");
        }else System.out.println("liste vide : " + fileVide());

    }
}
