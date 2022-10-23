/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class Responsable extends Employe{
    private int prime;

public Responsable (int id, String nom, String address, int nb_heures) {    
super(id,nom,address,nb_heures);
this.prime = prime;
}

@Override
public String toString() {
return "Responsable{"+ "id=" + getID() + ", nom=" + getNom() + ", adresse=" + getAddress() + ", nbr_h= "  + getNbheures()  + " prime= " + prime + '}';
    }

 public void salaire_responsable(){
     if (getNbheures() >160) {
     int heures_sup= getNbheures()-160;
     }
     int somme_heures= (getNbheures()* 10) + (heures_sup *12);
     System.out.println("Salaire Responsable = "+somme_heures);
        
    }
}
