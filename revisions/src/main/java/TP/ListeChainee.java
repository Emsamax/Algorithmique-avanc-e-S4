package TP;

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

        @Override
        public String toString() {
            return "Maillon{" +
                    "info=" + info +
                    ", suivant=" + suivant +
                    '}';
        }
    }
    Maillon tete; // tete fait reference au premier Maillon
    Maillon courant; // courant fait reference au maillon courant
    int nbrElements; // fait reference au nombre de maillon à un moment donne


    @Override
    public void initialiserListe() {
        tete = null;
        courant = null;
        nbrElements = 0;
    }

    @Override
    public void creerListe(int n) {
        Maillon m = new Maillon(0);
        tete = m;
        courant = tete;
        for (int i = 1; i < n; i++) {
            System.out.println("courant : " + courant.info);
            Maillon maillon = new Maillon(i);
            courant.suivant = maillon;
            System.out.println("info courant.suivant : "+ courant.suivant.info);
            courant = courant.suivant;
            System.out.println("courant : " + courant.info);
            nbrElements++;

        }
    }

    @Override
    public void insererDebut(Object ob) {
       courant = new Maillon(ob);
       courant.suivant = tete;
       tete = courant;
       nbrElements ++;
    }

    @Override
    public void insererApres(Object obNew, Object ob) {
        Maillon newMaillon = new Maillon(obNew);
        courant = tete;
        while(courant.info != newMaillon.info){
            courant.suivant = courant;
        }
        newMaillon.suivant = courant.suivant;
        courant.suivant = newMaillon;
        nbrElements ++;
    }

    @Override
    public Object supprimerDebut() {
        Object result = tete.info;
        tete.suivant = tete;
        nbrElements --;
        return result;
    }

    @Override
    public Object supprimerApres(Object ob) {
        courant = tete;
        while (courant.suivant.info != ob){
            courant.suivant = courant;
        }
        Object result = courant.suivant.info;
        courant.suivant = courant.suivant.suivant; //?
        nbrElements--;
        return result;
    }

    @Override
    public boolean listeVide() {
        if(nbrElements == 0){
            return true;
        } else return false;
    }

    @Override
    public int taille() {
        return nbrElements;
    }

    @Override
    public void afficher() {
        courant = tete;
        if(courant.info != null){
           do{
                System.out.print(courant.info + "|");
                courant = courant.suivant;
                if(courant.suivant == null){
                    break;
                }
            } while(courant.info != null);
        }
        System.out.println("liste vide : " + listeVide());



    }
}
