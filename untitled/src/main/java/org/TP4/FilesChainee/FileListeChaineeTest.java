package org.TP4.FilesChainee;

import org.TP4.FilesChainee.FileListeChainee;

public class FileListeChaineeTest {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        FileListeChainee file = new FileListeChainee();
        file.afficherFile();
        file.enfiler('A');
        file.enfiler('B');
        file.enfiler('C');
        file.enfiler('D');
        file.afficherFile();
        System.out.println("defiler(): " + file.defiler());
        file.afficherFile();
        System.out.println("lireDebut(): " + file.lireDebut());
        file.enfiler('E');
        file.enfiler('F');
        System.out.println("defiler(): " + file.defiler());
        file.afficherFile();
        System.out.println("taille(): " + file.taille());
    }
}

