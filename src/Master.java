/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur_Aly
 */
public class Master {
    private String nom_master,niveau_master,universite_accueil;
    public Master( String nom_master , String niveau_master, String universite_accueil){
       this.nom_master=nom_master;
       this.niveau_master=niveau_master;
       this.universite_accueil=universite_accueil;
        
    } 
    public String getnom_master(){
        return nom_master;
    }
    public String getniveau_master(){
        return niveau_master;
    }
    public String getuniversite_accueil(){
        return universite_accueil;
    }
}
