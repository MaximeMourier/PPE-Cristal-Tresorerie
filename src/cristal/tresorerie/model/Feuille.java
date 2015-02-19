package cristal.tresorerie.model;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public abstract class Feuille implements InterfaceFeuille {
    
    //1. ATTRIBUTS
    private String nom; //nom de la feuille (ex: Compte_Resultat, Bilan...)
    private HSSFSheet Sheet;
    
    //2. CONSTRUCTEUR   
    public Feuille(String N, int L, int C, Workbook wb) {
        this.nom = N;
            
        this.Sheet = (HSSFSheet) wb.createSheet(N); //instancie une HSSFSheet, du nom "N" à partir du Workbook wb
       
    }

    //3. SETTERS & GETTERS
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return this.nom;
    }


    @Override
    public HSSFSheet getSheet() {
        return Sheet;
    }

    @Override
    public void setSheet(HSSFSheet Sheet) {
        this.Sheet = Sheet;
    }
}
