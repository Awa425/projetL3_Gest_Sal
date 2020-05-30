/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awa
 */
public class Classe
{
     private int id_salles,places;
    private String nom_salle;
    private String projectable,acces_handicape,etat;
    public Classe(int id_salles, String nom_salle, int places,  String projectable,String acces_handicape,String etat){
        this.id_salles=id_salles;
        this.nom_salle=nom_salle;
       this.places=places;
       this.projectable=projectable;
        this.acces_handicape=acces_handicape;
         this.etat=etat;
    }
    public int getid_salles(){
        return id_salles;
    }
    public String getnom_salle(){
        return nom_salle;
    }
    
    public int getplaces(){
        return places;
    }
   
    public String getprojectable(){
        return projectable;
    }
    
    public String getacces_handicape(){
        return acces_handicape;
    }
   
    public String getetat(){
    return etat;
}

}
