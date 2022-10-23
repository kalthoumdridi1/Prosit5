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
public class Caissier extends Employe {
    private int NumeroCaisse;
    
    
 @Override
 public String toString() {
 return "Caissier{"+ "id=" + getID()+ ", nom=" + getNom() + ", adresse=" + getAddress() + ", nbr_h= " + getNbheures() + " numeroDeCaisse= " +NumeroCaisse + '}';
    }    
    
public Caissier (int id, String nom, String address, int nb_heures) {
super(id,nom,address,nb_heures);
this.NumeroCaisse= NumeroCaisse;
}

 public void salaire_caissier(){
     if (getNbheures() >180) {
     int heures_sup= getNbheures()-180;
     }
     int somme_heures= (getNbheures()* 5) + (heures_sup *7.25);
     System.out.println("Salaire Caissier = "+somme_heures);
        
    }
}


