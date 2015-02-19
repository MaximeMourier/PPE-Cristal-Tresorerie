package cristal.tresorerie.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
/*
 import org.apache.poi.hssf.util;
 import org.apache.poi.hssf.usermodel;
 import org.apache.poi.hssf.record.formula;
 import org.apache.poi.hssf.extractor;
 import org.apache.poi.hssf.eventusermodel;
 import org.apache.poi.hssf.eventmodel;
 */
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Classeur {

    //1. ATTRIBUTS
    private static final int NbOnglets = 8;
    private List<Feuille> Onglets; //une ArrayList de tous les onglets (feuille) de notre classeur Excel
    private Workbook wb; //l'objet workbook correspondant à notre classeur

    //2. CONSTRUCTEUR
    public Classeur() throws IOException {
        //instantiaciation d'une liste de 8 Onglets
        Onglets = new ArrayList<>(NbOnglets);
        //appel de la fonction de chargement
        wb = this.Chargement_fichier();
    }

    private Workbook Chargement_fichier() throws IOException {
        //methode qui ouvre le fichier Excel "Donnees"
        try {
            FileOutputStream fileOut;
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("Donnees.xls"));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            fileOut = new FileOutputStream("Donnees.xls");
            wb.write(fileOut);
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public List<Feuille> getOnglets() {
        return Onglets;
    }

    public void setOnglets(List<Feuille> Onglets) {
        this.Onglets = Onglets;
    }

    public Workbook getWb() {
        return wb;
    }

    public void setWb(Workbook wb) {
        this.wb = wb;
    }

    public void instanciation_modele() throws IOException {
        //1. instanciation de notre Classeur (appel du constructeur)
        Classeur Classeur = new Classeur();
        
        //2. on set chaque onglet à partir du workbook chargé
        for (int i = 0; i < Classeur.Onglets.size(); i++) {
            Onglets.get(i).setSheet((HSSFSheet) wb.getSheetAt(i));
            
        }


    }
}
