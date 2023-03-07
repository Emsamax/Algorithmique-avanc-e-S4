package TP;

public interface Liste {

    public void initialiserListe();
    public void creerListe(int n);
    public void insererDebut(Object ob);
    public void insererApres(Object obNew, Object ob);
    public Object supprimerDebut();
    public Object supprimerApres(Object ob);
    public boolean listeVide();
    public int taille();
    public void afficher();

}
