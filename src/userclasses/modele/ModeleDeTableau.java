package userclasses.modele;

import com.codename1.ui.events.DataChangedListener;
import com.codename1.ui.table.TableModel;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rsmon
 */
public class ModeleDeTableau implements TableModel{
    
   private ArrayList            entetes;
     
   private ArrayList<ArrayList> donneesDuModeleDuTableau;

   public ModeleDeTableau() {
        donneesDuModeleDuTableau = new ArrayList<ArrayList>();
   }

    public ModeleDeTableau(String ... titres) {
        this();
        entetes = new ArrayList(Arrays.asList(titres));
        donneesDuModeleDuTableau.add(entetes);
    }
     
   public int     getRowCount(){ return donneesDuModeleDuTableau.size()-1; }
   public int     getColumnCount(){ return donneesDuModeleDuTableau.get(0).size(); }
   public String  getColumnName(int i){ return (String) donneesDuModeleDuTableau.get(0).get(i); }
   public boolean isCellEditable(int row, int column) { return false;}
   public Object  getValueAt(int row, int column) { return donneesDuModeleDuTableau.get(row+1).get(column); }
   public void    setValueAt(int row, int column, Object o) {donneesDuModeleDuTableau.get(row+1).set(column, o); }
   public void    addDataChangeListener(DataChangedListener d) {}
   public void    removeDataChangeListener(DataChangedListener d) {}
       
   /**
    Vide le  Modèle de tableau et met en place les entêtes de colonnes
    @param   titres est une liste d'objets(le  + souvent des String ) chacun d'eux séparé par une virgule
   */
   public void remplirEntete(String ... titres) {

     donneesDuModeleDuTableau.clear();
     entetes= new ArrayList(Arrays.asList(titres));
     donneesDuModeleDuTableau.add(entetes);
   }         

   /**
    Ajouter une rangée dans le Modèle de tableau
    @param  valeurs est une liste d'objets(le  + souvent des String ) chacun d'eux séparé par une virgule
   */
   public void ajouterRangee(Object ... valeurs){
      
      ArrayList   uneLigne= new ArrayList();    
      uneLigne.addAll(Arrays.asList(valeurs));
      donneesDuModeleDuTableau.add(uneLigne); 
   }
      
   
   /**
    Vide le tableau ( mais les entêtes sont conservés) 
    */
   public void vider() {

     donneesDuModeleDuTableau.clear();
     donneesDuModeleDuTableau.add(entetes);
   }    
}

