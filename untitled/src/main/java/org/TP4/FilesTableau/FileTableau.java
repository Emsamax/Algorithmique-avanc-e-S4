package org.TP4.FilesTableau;

import org.TP4.File;

import java.util.ListResourceBundle;

public class FileTableau implements File {

    private int tailleMax; // taille maximale de la filee
    private Object[] file; // la file est un tableau
    private int debut;
    private int fin;
    private int nbElements; // taille de la file

    public FileTableau(int s) // constructeur
    {
        tailleMax = s;
        file = new Object[tailleMax];
        debut = fin = -1;
        nbElements = 0;

    }

    @Override
    public void enfiler(Object ob) {
        if(nbElements == 0){
            file[0] = ob;
            debut = 0;
            fin = 0;
            nbElements ++;
        }else if(fin+1 <= 5){
            file[fin+1] = ob;
            nbElements++;
            fin = nbElements;
        }
    }

    @Override
    public Object defiler() {
        Object result = file[debut];
        debut = debut+1;
        nbElements--;
        return result;
    }

    @Override
    public Object lireDebut() {
        return file[debut];
    }

    @Override
    public boolean fileVide() {
        if(nbElements == 0){
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
        System.out.println(lireDebut());

        for (int i = debut; i < tailleMax; i++) {
            if(file[i] == null)break;
            System.out.print(  i +":"+ file[i] + "| ");

        }

        System.out.println("");
    }
}
