/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awa
 */
public class Emploi_Temps
{
     private int id_em,heure_debut,heure_fin;
    private String niveau,filliaire,matiere,type_cours,jour;
    
    public Emploi_Temps(int id_em, String niveau, String filliaire,  String jour ,int heure_debut,int heure_fin,String matiere, String type_cours){
        this.id_em=id_em;
        this.niveau=niveau;
       this.filliaire=filliaire;
       this.jour=jour;
        this.heure_debut=heure_debut;
         this.heure_fin=heure_fin;
         this.matiere=matiere;
         this.type_cours=type_cours;
    }
    public int getid_em(){
        return id_em;
    }
    public String getniveau(){
        return niveau;
    }
    public String getfilliaire(){
        return filliaire;
    }
    
    public String getjour(){
        return jour;
    }
   
    public int getheure_debut(){
        return heure_debut;
    }
    
    public int getheure_fin(){
        return heure_fin;
    }
    public String getmatiere(){
    return matiere;
}
    public String gettype_cours(){
    return type_cours;
}

}
