/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur_Aly
 */
public class Personne {
    
    private String statut;
    private int id_personne;
    private String prenom,nom,mail;
    public Personne(int id_personne, String prenom, String nom,  String mail,String statut){
        this.id_personne=id_personne;
        this.prenom=prenom;
       this.nom=nom;
       this.mail=mail;
        this.statut=statut;
    }
    public int getid_personne(){
        return id_personne;
    }
    public String getprenom(){
        return prenom;
    }
    
    public String getnom(){
        return nom;
    }
   
    public String getmail(){
        return mail;
    }
    public String getstatut(){
    return statut;
}

    
}
