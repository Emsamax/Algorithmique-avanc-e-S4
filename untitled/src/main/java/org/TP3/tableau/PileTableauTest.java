package org.TP3.tableau;

public class PileTableauTest {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        PileTableau pile = new PileTableau(4); // créer une pile de taille 4
        Object element;
        System.out.println("Ajout de 3 éléments");
        pile.empiler('A'); // empiler 3 elements
        pile.empiler('B');
        pile.empiler('C');
        System.out.println("taille(): " + pile.taille());
        element = pile.depiler(); // supprimer element
        System.out.println(element + " est supprimé");
        System.out.println("taille(): " + pile.taille());
        System.out.println("Ajout de 3 éléments");
        pile.empiler('D'); // ajouter 3 éléments à la pile
        pile.empiler('E');
        pile.empiler('F');
        System.out.println(pile.depiler() + " est supprimé");
        System.out.println("Ajout d'un élément");
        pile.empiler('G'); // empiler un element
        element = pile.lireSommet(); // récupérer l'élément sommet de lSystem.out.println(element + " est au sommet de la pile");

    }
}