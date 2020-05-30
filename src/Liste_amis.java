/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur_Aly
 */
public class Liste_amis {
    long telephone;
      private String prenom,nom,adresse,mail,nom_master,niveau_master,nom_poste,entreprise;
      public Liste_amis(String prenom,String nom,String adresse,long telephone, String mail, String nom_master,String niveau_master,String nom_poste,String entreprise){
          this.prenom=prenom;
       this.nom=nom;
       this.adresse=adresse;
       this.telephone=telephone;
       this.mail=mail;
        this.nom_master=nom_master;
          this.niveau_master=niveau_master;
         this.nom_poste=nom_poste;
          this.entreprise=entreprise;
          
      }
       public String getprenom(){
        return prenom;
    }
    
    public String getnom(){
        return nom;
    }
    public String getadresse(){
        return adresse;
    }
    public long gettelephone(){
        return telephone;
    }
    public String getmail(){
        return mail;
    }
    public String getnom_master(){
    return nom_master;
}
    public String getniveau_master(){
    return niveau_master;
}
     public String getnom_poste(){
        return nom_poste;
    }
      public String getentreprise(){
        return entreprise;
    }
    
    
}
