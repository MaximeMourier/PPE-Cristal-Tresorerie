/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cristal.tresorerie.model;

import org.apache.poi.hssf.usermodel.HSSFSheet;

/**
 *
 * @author louislespagnol
 */
public interface InterfaceFeuille {
    
    //setters & getters
    public void setNom(String nom);
    public String getNom();
    /*
    public void setLignes(int L);
    public int getLignes();
    public int getColonnes();
    public void setColonnes(int C);
    */
    public HSSFSheet getSheet();
    public void setSheet(HSSFSheet Sheet);
}
