/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur_Aly
 */
public class Annee {
    private String annee_debut,annee_fin;
    private String nom_diplome,Etablissement_accueil;
    public Annee( String nom_diplome,String annee_debut,String annee_fin, String Etablissement_accueil){
       this.nom_diplome=nom_diplome;
       this.annee_debut=annee_debut;
       this.annee_fin=annee_fin;
       this.Etablissement_accueil=Etablissement_accueil;
    
   } 
     public String getnom_diplome(){
        return nom_diplome;
    }
    
    public String getannee_debut(){
        return annee_debut;
    }
    public String getannee_fin(){
        return annee_fin;
    }
    public String getEtablissement_accueil(){
        return Etablissement_accueil;
    }}
