
package Model;

import java.util.ArrayList;
import java.util.List;


public class Classeur {
    
    //1. ATTRIBUTS
    private List<Feuille> Onglets; //une ArrayList de tous les onglets (worksheet) de notre classeur Excel
    
    //2. CONSTRUCTEUR
    public Classeur () {
        Onglets = new ArrayList<>(9);
    }
   
    public void instanciation_modele () {
        //1. instanciation de notre Classeur
        Classeur Classeur = new Classeur();
        //2. on set le nom et la taille de chaque feuille
        for (int i=0; i<Classeur.Onglets.size(); i++) {
            String nomFeuille= ""; //le nom de la feuille
            int L = 0; //Nombre de lignes 
            int C = 0; //Nombre de colonnes
            switch(i) {
                case 0: {
                    nomFeuille = "Charges";
                    L = 58;
                    C = 12;
                }               
                    break;
                case 1: {
                    nomFeuille = "Produits";
                    L = 17;
                    C = 12;
                }
                    break;
                case 2: {
                    nomFeuille = "CompteResultat";
                    L = 6;
                    C = 1;
                }
                    break;
                case 3: {
                    nomFeuille = "Bilan";
                    L = 21;
                    C = 2;
                } 
                    break;
                case 4: {
                    nomFeuille = "BudgetVentes";
                    L = 2;
                    C = 36;
                } 
                    break;
                case 5: {
                    nomFeuille = "BudgetFraisCommerciaux";
                    L = 6;
                    C = 12;
                } 
                    break;
                case 6: {
                    nomFeuille = "BudgetProduction";
                    L = 11;
                    C = 12;
                }             
                    break;
                case 7: {
                    nomFeuille = "BudgetInvestissement";
                    L = 27;
                    C = 12;
                }
                    break;
                case 8: {
                    nomFeuille = "BudgetTresorerie";
                    L = 22;
                    C = 12;
                } 
                    break;
            }
            Classeur.Onglets.get(i).setNom(nomFeuille);
            Classeur.Onglets.get(i).setTableau(L,C);
        }
        //3. on initialise toutes les valeurs de chaque feuille à 0       
        for (int f=0; f<Classeur.Onglets.size(); f++) { //pour chaque feuille
            for (int i=0; i<Classeur.Onglets.get(f).getColonnes(); i++) {  //pour chaque ligne du tableau
                for (int j=0; j<Classeur.Onglets.get(f).getLignes(); j++) {  //pour chaque colonne du tableau
                    Classeur.Onglets.get(f).getTableau()[i][j]=0;
                }
            }
        }
       
    }
}
