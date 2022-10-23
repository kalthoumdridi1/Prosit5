/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Kal
 */
public class Employe {
    private int id; 
    private String nom;
    private String address;
    private int nb_heures; 
 
@Override    
public String toString ()   {
    return ("L'employe"+ " id:" + id + " nom:" + nom + "adresse:" + address + "nombre d'heures:" +nb_heures);
}

public int getID (){
        return this.id;
  }

public void setId(int id) {
this.id = id;
    }
    
 public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adresse) {
        this.address = address;
    }

    public int getNbheures() {
        return nb_heures;
    }

    public void setNbheures(int nb_heures) {
        this.nb_heures = nb_heures;
    }
  
   
}


