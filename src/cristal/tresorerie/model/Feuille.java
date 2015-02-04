package cristal.tresorerie.model;

public class Feuille {
    //1. ATTRIBUTS

    private String nom; //nom de la feuille (ex: Compte_Resultat, Bilan...)
    private int lignes;
    private int colonnes;
    private double[][] tableau; //une feuille Excel est un tableau de cellules

    //2. CONSTRUCTEUR
    public Feuille(String nom, int L, int C) {
        this.nom = nom;
        //allocation du tableau connaissant son nombre de lignes et de colonnes
        this.lignes = L;
        this.colonnes = C;
        this.tableau = new double[lignes][colonnes];
    }

    //3. SETTERS & GETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setLignes(int L) {
        this.lignes = L;
    }

    public int getLignes() {
        return this.lignes;
    }

    public int getColonnes() {
        return this.colonnes;
    }

    public void setColonnes(int C) {
        this.colonnes = C;
    }

    public double[][] getTableau() {
        return tableau;
    }

    public void setTableau(int L, int C) {
        this.tableau = new double[L][C];
    }
}
