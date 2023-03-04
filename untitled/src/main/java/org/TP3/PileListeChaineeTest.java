package org.TP3;

public class PileListeChaineeTest {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        PileListeChainee pile = new PileListeChainee(20); // creer un objet pile
        Object e; // stocker l element depile
        // ajouter 20, 35, 40 a la pile

        pile.afficherPile();
        pile.empiler(40);
        //pile.empiler(50);
        System.out.println("========TEST TAILLE=========");
        System.out.println(pile.taille());
        System.out.println("========TEST 1 =========");
        pile.afficherPile(); // afficher le contenu de la pile

        e = pile.depiler(); // depiler un element du sommet de la pile et l afficher
        if (e != null) {
            System.out.println("element depile : " + e);
            pile.afficherPile();
        }
        pile.empiler(65); // empiler 65, 70, 75
        pile.empiler(70);
        pile.empiler(75);
        System.out.println("========TEST 2 =========");
        pile.afficherPile(); // afficher le contenu de la pile
        e = pile.depiler(); // depiler un element du sommet de la pile et l afficher
        if (e != null) {
            System.out.println("element depile : " + e);
            pile.afficherPile();
        }
        System.out.println("lireSommet(): " + pile.lireSommet());// recuperer l element du sommet
        pile.empiler(90); // inserer 90
        pile.afficherPile();
    }
}
